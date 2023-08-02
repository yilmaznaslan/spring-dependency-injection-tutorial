package com.yilmaznaslan.ecommerce.customer;

import com.yilmaznaslan.ecommerce.customer.Customer;
import com.yilmaznaslan.ecommerce.customer.CustomerRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCustomerRepository implements CustomerRepository {
    private Map<String, Customer> database;

    public InMemoryCustomerRepository() {
        database = new HashMap<>();
        // Pre-populate the "database" with some customers
        database.put("1", new Customer("1", "John Doe"));
        database.put("2", new Customer("2", "Jane Doe"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return database.get(id);
    }
}
