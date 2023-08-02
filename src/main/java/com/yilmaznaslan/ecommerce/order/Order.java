package com.yilmaznaslan.ecommerce.order;

import com.yilmaznaslan.ecommerce.customer.Customer;
import com.yilmaznaslan.ecommerce.product.Product;

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
