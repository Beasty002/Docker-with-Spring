package com.beasty02.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome(){
        System.out.println("Hey my friend howdy");
        return "Welcome to Docker 1.0 - beasty";
    }
}
