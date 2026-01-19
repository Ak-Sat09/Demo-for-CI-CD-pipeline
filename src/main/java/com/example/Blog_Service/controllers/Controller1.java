package com.example.Blog_Service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller1 {

    @GetMapping
    public String helloApi1() {
        return "Hello from Controller11!";
    }
}
