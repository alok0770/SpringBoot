package com.example.demo._di_ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pop")
public class PopupService implements NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("Pop-up notification sent successfully !! ");
    }

}
