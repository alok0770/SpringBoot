package com.example.demo.day04_di_ioc;



public class Main {
    public static void main(String[] args) {

        NotificationService notification = new EmailService();

        OrderService order = new OrderService(notification);
        order.placeOrder();

    }
}
