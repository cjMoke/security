package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSecurity {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
