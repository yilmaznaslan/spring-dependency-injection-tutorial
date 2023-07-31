package com.yilmaznaslan.ecommerce.repository;

import com.yilmaznaslan.ecommerce.model.Order;

public interface OrderRepository {
    void saveOrder(Order order);
    // Other methods
}