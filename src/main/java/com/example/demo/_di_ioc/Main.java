package com.example.demo._di_ioc;


import com.example.demo._di_ioc.User.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);

        order.placeOrder();

        User user = context.getBean(User.class);

        System.out.println("Name : " + user.getName() + "\nAge : " + user.getAge());
    }
}
