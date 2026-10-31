package com.example.demo._di_ioc;

import org.springframework.stereotype.Component;

@Component
public class PopupService implements NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("Pop-up notification sent successfully !! ");
    }

}
