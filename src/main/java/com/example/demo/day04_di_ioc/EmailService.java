package com.example.demo.day04_di_ioc;

public class EmailService implements NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("Email notification sent successfully !! ");
    }

}
