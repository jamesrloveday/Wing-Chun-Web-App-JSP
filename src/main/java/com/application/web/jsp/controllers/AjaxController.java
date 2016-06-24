/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.web.jsp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author James Loveday
 */
@RestController
public class AjaxController {
    
        @RequestMapping(value = "/wingchun/register/newUserPage")
        public String getRegisterNewUserPage() {
            return "/wingchun/register/newUserPage";
        }
    
}
