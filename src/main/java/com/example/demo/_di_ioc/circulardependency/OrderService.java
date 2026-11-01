package com.example.demo._di_ioc.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    public PaymentService payment;


    @Lazy
    public OrderService(PaymentService payment){
        this.payment = payment;
    }

    public void placeOrder(){
        payment.pay();
        System.out.println("Order Placed !! ");
    }

    public void getDetails(){
        System.out.println("Order details !! ");
    }
}
