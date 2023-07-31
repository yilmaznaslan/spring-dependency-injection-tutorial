package com.yilmaznaslan.ecommerce.repository.impl;

import com.yilmaznaslan.ecommerce.model.Customer;
import com.yilmaznaslan.ecommerce.model.Product;
import com.yilmaznaslan.ecommerce.repository.CustomerRepository;
import com.yilmaznaslan.ecommerce.repository.ProductRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryProductRepository implements ProductRepository {
    private Map<String, Customer> database;

    public InMemoryProductRepository() {
        database = new HashMap<>();
        // Pre-populate the "database" with some customers
        database.put("1", new Customer("1", "John Doe"));
        database.put("2", new Customer("2", "Jane Doe"));
    }

    @Override
    public Product findProductById(String id) {
        return null;
    }

    @Override
    public List<Product> findProductsInStock() {
        return null;
    }

    @Override
    public void updateProductQuantity(String id, int quantity) {

    }
}
