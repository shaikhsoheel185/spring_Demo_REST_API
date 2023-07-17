package com.demorestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class helloworldcontroller {

    // Http Get Request
    // http://localHost:8080/Hello-world



    @GetMapping("/hello-world")
    public String hello() {

        return "Hello World SprongBoot 1 !";
    }
}
