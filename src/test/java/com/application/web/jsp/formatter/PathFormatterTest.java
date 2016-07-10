/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.web.jsp.formatter;

import com.application.web.jsp.formatters.PathFormatter;
import com.application.web.jsp.transferObjects.Image;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 *
 * @author James Loveday
 */
@RunWith(JUnit4.class) 
public class PathFormatterTest {
    
    private Image testImage;
    private List<Image> imageTestList; 
    private String alteredString; 
    
    @Before
    public void setUp() {
        testImage = new Image(0, "C:\\Users\\james\\Documents\\java projects\\Wing-Chun-Web-App-JSP\\src\\main\\webapp\\resources\\images\\siuNimTao\\basic stance.jpg", "siu nim tao", "section 1", "basic stance"); 
        imageTestList = new ArrayList<>();
        imageTestList.add(testImage); 
        alteredString = "../../resources/images/siuNimTao/basic stance.jpg"; 
    }
    
    @Test
    public void returnCorrectFilePathForImage() {
        PathFormatter.formatImagePath(imageTestList); 
        assertTrue("File location is not correct", imageTestList.get(0).getFileLocation().equals(alteredString)); 
    }
    
}
