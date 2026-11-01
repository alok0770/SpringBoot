package com.example.demo._di_ioc.beanscopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype Scope Example:
 * Like a Shopping Cart in Amazon / Supermarket - every customer gets
 * their OWN fresh new cart. One customer's items do NOT mix with another's.
 */
@Component
@Scope("prototype") // Spring will create a (BRAND NEW) instance every single time!
public class ShoppingCart {

    private final List<String> items = new ArrayList<>();

    public ShoppingCart() {
        System.out.println("[Prototype] New ShoppingCart instance created in memory!");
    }

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }
}
