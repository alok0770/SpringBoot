package com.example.demo._di_ioc.BeanLifeCycle;

import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {

    public String getDbUrl() {
        return "jdbc:mysql://localhost:3306/ecommerce_db";
    }
}
