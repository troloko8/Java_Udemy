package Nathan.spring_security.controller;

import org.springframework.web.bind.annotation.RestController;

import Nathan.spring_security.model.User;
import Nathan.spring_security.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        service.save(user);
        return user;
    }
    
}
