/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.web.jsp.controllers;

import com.application.web.jsp.service.ImageService;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author James Loveday
 */
@Controller
@RequestMapping("/wingchun")
public class ImageController {
    
    @Value("${base.url}")
    private String dbUrl; 
    @Autowired
    private ImageService imageService; 

    @RequestMapping(value = "/images/newImage", method = RequestMethod.GET)
    public String getImageUploadPage() {
        return "newImage";
    }
    
    @RequestMapping(value = "/termsAndConditions", method = RequestMethod.GET) 
    public String getTermsAndConditionsPage() {
    	return "termsAndConditionsPage"; 
    }
    
    @RequestMapping(value = "/images/uploadImage", method = RequestMethod.POST)
    public String uploadNewFile(@RequestParam("file") MultipartFile file, @RequestParam("imageTitle") String title,
            @RequestParam("imageForm") String form, @RequestParam("imageSection") String section, Model model) {
        String formImagePath = formImagePath(form.toLowerCase(Locale.ENGLISH)); 
        String redirectString = ""; 
        if(!file.isEmpty()) {
            try{ 
               Files.copy(file.getInputStream(), 
                       Paths.get("../webapp/resources/images" + File.pathSeparator + formImagePath + File.pathSeparator + file.getOriginalFilename()));  
               imageService.saveNewImage(dbUrl, "../webapp/resources/images" + File.pathSeparator + formImagePath + File.pathSeparator + file.getOriginalFilename(), 
                       title, form, section); 
               redirectString = "home"; 
            }catch(Exception e) {
                //log out the exception
                String errorMessage = "The file could not be uploaded, it may be too large or the title does not meet the criteria,"
                        + "try siu nim tao instead of SiuNimTao"; 
                model.addAttribute("errorMessage", errorMessage); 
                redirectString = "newImage"; 
            }
        }
        return redirectString; 
    }
    
    private String formImagePath(String form) {
        String imagePath = ""; 
        switch(form) {
            case "siu nim tao": 
                imagePath = "siuNimTao"; 
                break;
            case "chum kiu":
                imagePath = "chumKiu";
                break;
            case "biu tze":
                imagePath = "buTze"; 
                break;
            case "mook jong":
                imagePath = "mookJong"; 
                break;
            case "bat dam":
                imagePath = "batDam";
                break;
            case "poles":
                imagePath = "poles";
                break;
        }
        return imagePath; 
    }
}
