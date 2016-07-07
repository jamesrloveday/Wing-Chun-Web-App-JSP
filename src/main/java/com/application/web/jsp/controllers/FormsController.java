/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.web.jsp.controllers;

import com.application.web.jsp.service.SiuNimTaoFormService;
import com.application.web.jsp.transferObjects.Image;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author James Loveday
 */
@Controller
@RequestMapping("/wingchun")
public class FormsController {
    
    @Value("${base.url}")
    private String dbUrl;   
    @Autowired
    private SiuNimTaoFormService siuNimTaoFormService; 
    
    @RequestMapping(value = "/forms/siuNimTao", 
            method = RequestMethod.GET)
    public String getSiuNimTaoForm() {
        try {
        List<Image> siuNimTaoImages = siuNimTaoFormService.getAllImages(dbUrl);
        } catch(IOException ioe) {
            //TODO
        }
        return "/siuNimTaoForm"; 
    }
    
    @RequestMapping(value = "/forms/chumKiu", 
            method = RequestMethod.GET)
    public String getChunKiuForm() {
        return "/chumKiuForm"; 
    }
    
    @RequestMapping(value = "/forms/biuTze", 
            method = RequestMethod.GET)
    public String getBiuTzeForm() {
        return "/biuTzeForm"; 
    }
    
    @RequestMapping(value = "/forms/batDam",
            method = RequestMethod.GET) 
    public String getBatDamForm() {
        return "/batDamForm"; 
    }
    
    @RequestMapping(value = "/forms/poles", 
            method = RequestMethod.GET) 
    public String getPolesForm() {
        return "/polesForm"; 
    }
    
    @RequestMapping(value = "/forms/dummy", 
            method = RequestMethod.GET) 
    public String getDummyForm() {
        return "/dummyForm"; 
    }
    
    @RequestMapping(value = "/forms/history", 
            method = RequestMethod.GET)
    public String getWingChunHistory() {
        return "/history"; 
    }
    
    @RequestMapping(value = "/forms/principals", 
            method = RequestMethod.GET)
    public String getWingChunPrincipals() {
        return "/principals"; 
    }
    
    
}
