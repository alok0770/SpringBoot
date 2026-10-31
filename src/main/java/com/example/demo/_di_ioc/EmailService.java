package com.example.demo._di_ioc;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailService implements NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("Email notification sent successfully !! ");
    }

}
