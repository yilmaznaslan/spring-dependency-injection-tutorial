package com.yilmaznaslan.ecommerce.order;

import com.yilmaznaslan.ecommerce.customer.Customer;

import java.util.HashMap;
import java.util.Map;

public class InMemoryOrderRepository implements OrderRepository {
    private Map<String, Order> database;

    public InMemoryOrderRepository() {
        database = new HashMap<>();
        // Pre-populate the "database" with some orders
        database.put("1", new Order("1", new Customer("1", "John Doe")));
        database.put("2", new Order("1", new Customer("2", "Marie Doe")));
    }

    @Override
    public void saveOrder(Order order) {

    }
}
