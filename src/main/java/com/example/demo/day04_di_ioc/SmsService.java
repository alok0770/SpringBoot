package com.example.demo.day04_di_ioc;

public class SmsService implements NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("Sms notification sent successfully !! ");
    }

}
