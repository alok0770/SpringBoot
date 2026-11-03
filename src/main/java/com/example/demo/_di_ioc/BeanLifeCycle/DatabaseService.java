package com.example.demo._di_ioc.BeanLifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService {

    @Autowired
    private DatabaseConnection dbConnection;

    // Phase 1: Instantiation (Constructor)
    public DatabaseService() {
        System.out.println("Step 1: [Constructor] DatabaseService instance created.");
        System.out.println("        -> dbConnection value during constructor: " + dbConnection); // Will be null!
    }

    // Phase 2: Initialization Callback (@PostConstruct)
    // Runs right AFTER all dependencies are injected (@Autowired is ready)
    @PostConstruct
    public void init() {
        System.out.println("Step 2: [@PostConstruct] Dependencies injected successfully!");
        System.out.println("        -> Connected to: " + dbConnection.getDbUrl());
        System.out.println("        -> Database connection pool is READY!");
    }

    // Phase 3: Business Logic (Bean is in active use)
    public void executeQuery() {
        System.out.println("Step 3: [Work] Executing query: SELECT * FROM users;");
    }

    // Phase 4: Destruction Callback (@PreDestroy)
    // Runs right BEFORE the bean is destroyed when application context closes
    @PreDestroy
    public void cleanup() {
        System.out.println("Step 4: [@PreDestroy] Container is shutting down.");
        System.out.println("        -> Closing all database connections safely. Cleanup DONE!");
    }
}
