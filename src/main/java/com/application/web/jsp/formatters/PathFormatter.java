/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.web.jsp.formatters;

import com.application.web.jsp.transferObjects.Image;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author James Loveday
 */
public class PathFormatter {

    public static void formatImagePath(List<Image> imagesForSiuNimTao) {
        
        imagesForSiuNimTao.stream().forEach((eachImage) -> {
                StringBuilder builder = new StringBuilder(); 
                builder.append("../../"); 
                String location = eachImage.getFileLocation();
                String[] splitStrings = location.split(Pattern.quote("\\")); 
                    for(int i = 9; i < splitStrings.length - 1; i++) {
                        builder.append(splitStrings[i]).append("/"); 
                     }
                builder.append(splitStrings[splitStrings.length - 1]); 
                eachImage.setFileLocation(builder.toString());
        });
    }
    
}
