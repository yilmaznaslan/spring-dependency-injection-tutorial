package com.yilmaznaslan.ecommerce.order;

import com.yilmaznaslan.ecommerce.order.Order;

public interface OrderRepository {
    void saveOrder(Order order);
    // Other methods
}