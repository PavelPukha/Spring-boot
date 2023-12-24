package com.luv2code.spingboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello ";
    }
}
