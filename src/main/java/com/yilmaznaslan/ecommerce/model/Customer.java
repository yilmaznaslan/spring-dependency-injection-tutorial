package com.yilmaznaslan.ecommerce.model;

// model/Customer.java
public class Customer {
    private String id;
    private String name;
    private String email;
    private String address;
    // Getters, Setters, and other methods


    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}