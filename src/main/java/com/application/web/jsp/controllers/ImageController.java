/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.web.jsp.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
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
        if(!file.isEmpty()) {
            try{
               Files.copy(file.getInputStream(), 
                       Paths.get("../webapp/resources/images" + File.pathSeparator + formImagePath + File.pathSeparator + file.getOriginalFilename())); 
            }catch(Exception e) {
                
            }
        }
        return null; 
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

    /**
     * @RequestMapping(method = RequestMethod.POST, value = "/") public String handleFileUpload(@RequestParam("file") MultipartFile file,
     * RedirectAttributes redirectAttributes) { if (!file.isEmpty()) { try { Files.copy(file.getInputStream(), Paths.get(ROOT,
     * file.getOriginalFilename())); redirectAttributes.addFlashAttribute("message", "You successfully uploaded " + file.getOriginalFilename() + "!");
     * } catch (IOException|RuntimeException e) { redirectAttributes.addFlashAttribute("message", "Failure to upload " + file.getOriginalFilename() +
     * " => " + e.getMessage()); } } else { redirectAttributes.addFlashAttribute("message", "Failed to upload " + file.getOriginalFilename() + "
     * because it was empty"); }
     *
     * return "redirect:/"; } /
     */
