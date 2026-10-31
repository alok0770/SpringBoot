package com.example.demo._di_ioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmsService implements NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("Sms notification sent successfully !! ");
    }

}
