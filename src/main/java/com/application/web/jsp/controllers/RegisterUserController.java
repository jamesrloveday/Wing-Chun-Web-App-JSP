/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.web.jsp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author James Loveday
 */
@Controller
@RequestMapping("/wingchun")
public class RegisterUserController {
    
    @RequestMapping(value = "/register/newUserPage", method = RequestMethod.GET) 
    public String getRegisterNewUserPage() {
        return "register"; 
    }
    
}
