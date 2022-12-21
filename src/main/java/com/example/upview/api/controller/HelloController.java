package com.example.upview.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping
    public String test(){
        return "test v2";
    }
}
