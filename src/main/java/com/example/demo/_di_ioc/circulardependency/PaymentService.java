package com.example.demo._di_ioc.circulardependency;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    @Autowired
    public OrderService order;

//    public PaymentService(OrderService order){
//        this.order = order;
//    }

    public void pay (){

        order.getDetails();
        System.out.println("Payment Successful !! ");
    }
}
