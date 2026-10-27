package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello (){
        return  "<h1>Hello Alok</h1>";
    }

    @GetMapping("age")
    public void age (){
        int age = 20;
        System.out.println(age);
    }
}
