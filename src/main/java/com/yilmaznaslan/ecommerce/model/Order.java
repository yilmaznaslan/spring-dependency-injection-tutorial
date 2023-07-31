package com.yilmaznaslan.ecommerce.model;

import java.util.List;

public class Order {
    private String id;
    private Customer customer;
    private List<Product> products;
    private double total;
    // Getters, Setters, and other methods


    public Order(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
}
