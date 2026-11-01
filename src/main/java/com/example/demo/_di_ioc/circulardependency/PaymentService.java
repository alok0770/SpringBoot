package com.example.demo._di_ioc.circulardependency;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {


    public OrderService order;

    @Lazy
    public PaymentService(OrderService order){
        this.order = order;
    }

    public void pay (){

        order.getDetails();
        System.out.println("Payment Successful !! ");
    }
}
