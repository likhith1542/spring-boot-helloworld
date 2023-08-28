package com.knf.dev.demo.springboothelloworld;

import org.springframework.boot.*;
@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World! Your application is running";
    }
}