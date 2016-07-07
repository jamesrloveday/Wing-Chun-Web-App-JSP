/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.web.jsp.service;

import com.application.web.jsp.WingChunWebJspApplication;
import com.application.web.jsp.service.impl.SiuNimTaoFormServiceImpl;
import com.application.web.jsp.transferObjects.Image;
import java.io.IOException;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author James Loveday
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WingChunWebJspApplication.class)
public class SiuNimTaoFormServiceImplTest {
    
    @Value("${base.url}")
    private String baseUrl; 
    
    
    
    
    private SiuNimTaoFormService siuNimTaoFormService; 
    
    @Before
    public void setUp() {
        siuNimTaoFormService = new SiuNimTaoFormServiceImpl(); 
    }
    
    @Test
    public void getAllImagesForSiuNimTaoForm() throws IOException {
        List<Image> images = siuNimTaoFormService.getAllImages(baseUrl); 
        assertTrue("Images list is empty is your database runing", images.size() > 0); 
    }
    
}
