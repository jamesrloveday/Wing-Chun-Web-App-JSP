/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.web.jsp.controllers;

import com.application.web.jsp.service.UserService;
import com.application.web.jsp.transferObjects.User;
import com.application.web.jsp.validator.FieldValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author James Loveday
 */
@Controller
@RequestMapping("/wingchun")
public class RegisterUserController implements FieldValidator {
    
    private final UserService userService; 
    
    @Autowired
    public RegisterUserController(UserService userService) {
        this.userService = userService; 
    }
    
    @RequestMapping(value = "/register/newUserPage", method = RequestMethod.GET) 
    public String getRegisterNewUserPage() {
        return "register"; 
    }
    
    @RequestMapping(value = "/registerNewUserDetails", method = RequestMethod.POST) 
    public String registerNewUserDetails(@RequestParam("username") String username,
            @RequestParam("password") String password, 
            @RequestParam("firstName") String firstName, 
            @RequestParam("lastName") String lastName,
            @RequestParam("instructorName") String instructorName,
            @RequestParam("clubLocation") String clubLocation,
            @RequestParam("email") String email) {
        String navigateToNextPage = "redirect:register"; 
        if(this.isNotNull(username) && this.isNotNull(password) && 
                this.isNotNull(firstName) && this.isNotNull(lastName) && 
                this.isNotNull(instructorName) && this.isNotNull(clubLocation) && 
                this.isNotNull(email)) {
            User userToSave = new User(firstName, lastName, 
                    clubLocation, instructorName, username, password, email);
            userService.save(userToSave); 
            navigateToNextPage = "/home"; 
        }
        return navigateToNextPage; 
    }
    
    @RequestMapping(value = "/register/termsAndConditions", method = RequestMethod.GET) 
    public String getTsAndCsPage() {
        return "termsAndConditionsPage"; 
    }
    
}
