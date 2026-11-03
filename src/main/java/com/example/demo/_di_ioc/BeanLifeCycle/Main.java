package com.example.demo._di_ioc.BeanLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== 1. STARTING SPRING CONTAINER ==========");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfiApp.class);

        System.out.println("\n========== 2. USING THE BEAN ==========");
        DatabaseService dbService = context.getBean(DatabaseService.class);
        dbService.executeQuery();

        System.out.println("\n========== 3. CLOSING SPRING CONTAINER ==========");
        // context.close() calls @PreDestroy methods on all singleton beans
        context.close();

        System.out.println("========== 4. APPLICATION TERMINATED ==========");
    }
}
