package com.geeksforgeeks.SpringBootHelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "<h1>Hello World desde Spring Boot!</h1>";
    }
}