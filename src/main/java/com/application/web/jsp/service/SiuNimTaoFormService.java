/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.web.jsp.service;

import com.application.web.jsp.transferObjects.Image;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author James Loveday
 */
public interface SiuNimTaoFormService {
    
    /**
     * Gets all images for the Form
     * 
     * @param baseUrl
     * @return a List of images
     * @throws IOException 
     */
    public List<Image> getAllImages(String baseUrl) throws IOException;
}
