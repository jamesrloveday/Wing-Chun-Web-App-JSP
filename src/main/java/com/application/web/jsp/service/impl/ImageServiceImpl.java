/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.web.jsp.service.impl;

import com.application.web.jsp.service.ImageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author jloveday
 */
@Component("imageService")
public class ImageServiceImpl implements ImageService {
    
      
    private RestTemplate restTemplate; 
    
    public ImageServiceImpl() {
        this.restTemplate = new RestTemplate(); 
    }

    @Override
    public void saveNewImage(String restUrl, String string, String title, String form, String section) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
