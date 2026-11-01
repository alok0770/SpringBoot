package com.example.demo._di_ioc.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== 1. STARTING SPRING CONTAINER ==========");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("\n========== 2. TESTING SINGLETON SCOPE (PrinterService) ==========");
        // Pehli baar PrinterService maangi
        PrinterService printer1 = context.getBean(PrinterService.class);
        printer1.printDocument("Alok", "Resume.pdf");

        // Doosri baar PrinterService maangi
        PrinterService printer2 = context.getBean(PrinterService.class);
        printer2.printDocument("Rahul", "OfferLetter.pdf");

        System.out.println("printer1 HashCode : " + printer1.hashCode());
        System.out.println("printer2 HashCode : " + printer2.hashCode());
        System.out.println("Kya dono SAME object hain? " + (printer1 == printer2)); // true!


        System.out.println("\n========== 3. TESTING PROTOTYPE SCOPE (ShoppingCart) ==========");
        // Pehle customer (Alok) ke liye naya cart
        ShoppingCart cart1 = context.getBean(ShoppingCart.class);
        cart1.addItem("MacBook M3");
        cart1.addItem("iPhone 16");

        // Doosre customer (Rahul) ke liye naya cart
        ShoppingCart cart2 = context.getBean(ShoppingCart.class);
        cart2.addItem("Java Programming Book");

        System.out.println("cart1 HashCode : " + cart1.hashCode());
        System.out.println("cart2 HashCode : " + cart2.hashCode());
        System.out.println("Kya dono SAME cart hain? " + (cart1 == cart2)); // false!

        System.out.println("\nAlok ke Cart 1 mein items: " + cart1.getItems());
        System.out.println("Rahul ke Cart 2 mein items: " + cart2.getItems());
        System.out.println("===============================================================");
    }
}
