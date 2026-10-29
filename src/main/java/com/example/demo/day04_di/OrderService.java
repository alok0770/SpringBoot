package com.example.demo.day04_di;
public class OrderService {

NotificationService notification;

    public OrderService(NotificationService notification){
     this.notification = notification;
    }

    public void placeOrder(){
        System.out.println("Order Placed !! ");
        notification.sendNotification();
    }
}
