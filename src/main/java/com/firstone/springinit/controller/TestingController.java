package com.firstone.springinit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//localhost:8080/api
@RequestMapping("/api")
public class TestingController {

    @GetMapping("/name")
    public String getName()
    {
        return "I am Muhannd";
    }
}
