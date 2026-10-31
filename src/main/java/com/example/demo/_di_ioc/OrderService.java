package com.example.demo._di_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

 private final NotificationService notification;

 @Autowired
    public OrderService(@Qualifier("popupService") NotificationService notification){
        this.notification = notification;
    }
    public void placeOrder(){
        System.out.println("Order Placed !! ");
        notification.sendNotification();
    }
}
