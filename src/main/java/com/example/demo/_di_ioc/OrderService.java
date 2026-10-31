package com.example.demo._di_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

 private NotificationService notification;

@Autowired
 public OrderService(NotificationService notification){
     this.notification = notification;
 }

    public OrderService(){

    }
    public void placeOrder(){
        System.out.println("Order Placed !! ");
        notification.sendNotification();
    }
}
