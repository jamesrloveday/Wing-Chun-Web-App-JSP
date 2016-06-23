package com.application.web.jsp.controllers;

import com.application.web.jsp.service.LoginService;
import com.application.web.jsp.transferObjects.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by james on 13/06/2016.
 *
 * Login controller class to return the login page and to handle login requests from the user.
 */
@Controller
@RequestMapping("/wingchun")
public class LoginController {

    private LoginService loginService;

    public LoginController() {} //default constructor

    @Autowired
    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }

    @RequestMapping(value = "login")
    public String getLoginPage(Model model) {
        return "login";
    }
    
    @RequestMapping(value = "home", params = {"loginUser"})
    public String loginUser(@RequestParam("username") String username,
            @RequestParam("password") String password, Model model) {
        User user = new User(username, password); 
        final boolean loggedIn = loginService.loginUser(user);
            if(loggedIn) return "/home";  
            else return "redirect:login";
    }

}
