/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.web.jsp.service.impl;

import com.application.web.jsp.service.SiuNimTaoFormService;
import com.application.web.jsp.transferObjects.Image;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    
    private RestTemplate restTemplate; 
    private ObjectMapper objectMapper; 
    
    @Autowired
    public SiuNimTaoFormServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate; 
    }

    @Override
    public List<Image> getAllImages() {
        /**
         * ObjectMapper mapper = new ObjectMapper();
String jsonInString = "{'name' : 'mkyong'}";

//JSON from file to Object
User user = mapper.readValue(new File("c:\\user.json"), User.class);

//JSON from String to Object
User user = mapper.readValue(jsonInString, User.class);
         */
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
