package com.example.training.controllers;

import com.example.training.service.Services;

import com.example.training.validator.Validations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
@RestController
public class RegistrationController {
    private final Services service;
    private final Validations validator;

    public RegistrationController(Services service, Validations validator) {
        this.service = service;
        this.validator = validator;
    }

    @RequestMapping("/")
    public String showLogIn(){
        return " must return the login component";
    }

    @RequestMapping("/register")
    public String showRegisterPage(){
        return "must return the registration page";
    }

}
