package com.application.web.jsp.service.impl;

import com.application.web.jsp.service.LoginService;
import com.application.web.jsp.service.UserService;
import com.application.web.jsp.transferObjects.User;
import com.application.web.jsp.validator.FieldValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by james on 13/06/2016.
 */
@Component("loginService")
public class LoginServiceImpl implements LoginService, FieldValidator {

    private final UserService userService;

    @Autowired
    public LoginServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean loginUser(User user) {
        if(this.isNotNull(user.username) && this.isNotNull(user.password)) {
            User testableUser = userService.findUser(user.username, user.password); 
            if((testableUser.id != null)) {
                return true ;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
