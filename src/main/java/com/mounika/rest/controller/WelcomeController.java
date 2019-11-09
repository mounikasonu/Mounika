package com.mounika.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/name/{name}")
    public String welcome(@PathVariable(name = "name")String name){
        return  "Welcome "+name;
    }
}
