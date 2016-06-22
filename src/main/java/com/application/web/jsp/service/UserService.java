package com.application.web.jsp.service;


import com.application.web.jsp.transferObjects.User;

import java.util.List;

/**
 * Created by james on 02/06/2016.
 */
public interface UserService {

    User save(User u);
    List<User> findAll();
    User findUser(String id);
    User findUser(String username, String password);
}
