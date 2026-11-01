package com.example.demo._di_ioc.beanscopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Singleton Scope Example:
 * Like an Office Printer - there is only ONE printer in the whole office,
 * and everyone shares the same printer instance.
 */
@Component
@Scope("singleton") // By default Spring beans are singleton, this annotation is explicit
public class PrinterService {

    public PrinterService() {
        System.out.println("🖨️ [Singleton] PrinterService instance created in memory!");
    }

    public void printDocument(String user, String documentName) {
        System.out.println("🖨️ Printing '" + documentName + "' for user: " + user + " (Instance ID: " + this.hashCode() + ")");
    }
}
