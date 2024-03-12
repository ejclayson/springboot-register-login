package com.tesda.bankapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesda.bankapp.models.ApplicationUser;
import com.tesda.bankapp.models.LoginResponseDTO;
import com.tesda.bankapp.models.RegistrationDTO;
import com.tesda.bankapp.services.AuthenticationService;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO body) {
        return authenticationService.registerUser(body.getUsername(), body.getPassword());

    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body) {
        // TODO: process POST request
        return authenticationService.loginUser(body.getUsername(), body.getPassword());

    }

}
