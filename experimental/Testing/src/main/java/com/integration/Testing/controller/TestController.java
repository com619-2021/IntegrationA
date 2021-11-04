package com.integration.Testing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    Author: Tom Lange
    Created: 26.10.2021
 */
@RestController
public class TestController {

    //output to localhost:8080/test
    @RequestMapping("/test")
    public String testOutput(){
        return "Hello World";
    }

    //output to localhost:8080/testChange
    @RequestMapping("/testChange")
    public String testOutputTwo(){
        return "Hello World Two";
    }
}
