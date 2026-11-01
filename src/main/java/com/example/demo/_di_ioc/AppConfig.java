package com.example.demo._di_ioc;

import com.example.demo._di_ioc.user.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo._di_ioc")

public class AppConfig {

    @Bean
    public User creatUser(){
        return new User ("Alok" , 21);
    }
}
