package com.application.web.jsp.service;

import com.application.web.jsp.WingChunWebJspApplication;
import com.application.web.jsp.service.impl.LoginServiceImpl;
import com.application.web.jsp.transferObjects.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;

/**
 * Created by james on 15/06/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WingChunWebJspApplication.class)
public class LoginServiceTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private UserService userService;
    private LoginServiceImpl loginService;

    private User user;
    private User invalidUser; 

    @Before
    public void setUp() {
        mongoTemplate.dropCollection(User.class);
        mongoTemplate.createCollection(User.class);
        loginService = new LoginServiceImpl(userService);
        user = new User("testFirst",
                "testLast",
                "testLocation",
                "test instructor",
                "testUsername",
                "testPassword",
                "test@test.com");
        userService.save(user); 
        invalidUser = new User("second", 
                 "second", 
                "secondLocation", 
                "secondInstructor", 
                "secondUsername", 
                "secondPassword", 
                "second@second.com"); 
        
    }

    @Test
    public void returnsTrueWhenLoggingInValidUser() {
        boolean loggedIn = loginService.loginUser(user);
        assertTrue("Returned result not true, has the user been saved", loggedIn);
    }

    @Test
    public void returnsFalseWhenLoggingInInvalidUser() {
        boolean loggedIn = loginService.loginUser(invalidUser); 
        assertFalse("Returned result not false, A user should not have been saved", loggedIn); 
    }

}
