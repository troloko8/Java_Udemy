package Nathan.spring_security.controller;

import org.springframework.web.bind.annotation.RestController;

import Nathan.spring_security.model.User;
import Nathan.spring_security.service.JwtService;
import Nathan.spring_security.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    @Autowired
    private JwtService jwtService;
    
    @Autowired
    private UserService service;

    @PostMapping("register")
    public User register(@RequestBody User user) {
        service.save(user);
        return user;
    }

    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("login")
    public String login(@RequestBody User user) {

        try {
            Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
            );

            return jwtService.generateToken(user.getUsername());

        } catch (Exception e) {
            return "Login failed";
        }
    }
}
