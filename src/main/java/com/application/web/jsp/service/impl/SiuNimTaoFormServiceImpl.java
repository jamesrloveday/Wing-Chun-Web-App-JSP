/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.web.jsp.service.impl;

import com.application.web.jsp.formatters.PathFormatter;
import com.application.web.jsp.service.SiuNimTaoFormService;
import com.application.web.jsp.transferObjects.Image;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author James Loveday
 */
@Component("siuNimTaoFormService")
public class SiuNimTaoFormServiceImpl implements SiuNimTaoFormService {
    
    private static final String GET_ALL_IMAGES_FOR_SIUNIMTAO = "getAllImagesForForm?form=siu nim tao"; 
    private RestTemplate restTemplate; 
    
    public SiuNimTaoFormServiceImpl() {
        this.restTemplate = new RestTemplate(); 
    }

    @Override
    public List<Image> getAllImages(String baseUrl) throws IOException {
        final String uri = baseUrl + GET_ALL_IMAGES_FOR_SIUNIMTAO; 
        String imageListJson = restTemplate.getForObject(uri, String.class); 
        ObjectMapper mapper = new ObjectMapper(); 
        List<Image> imagesForSiuNimTao = mapper.readValue(imageListJson, new TypeReference<List<Image>>(){}); 
        PathFormatter.formatImagePath(imagesForSiuNimTao); 
        return imagesForSiuNimTao; 
    }
    
}
