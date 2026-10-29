package com.example.demo.day04_di_ioc;

public class PopupService implements NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("Pop-up notification sent successfully !! ");
    }

}
