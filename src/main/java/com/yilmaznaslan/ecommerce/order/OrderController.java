package com.yilmaznaslan.ecommerce.order;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.util.List;

public class OrderController implements HttpHandler  {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public void createOrder(String customerId, List<String> productIds) {
        // Handle HTTP request
    }

    public void refundOrder(String orderId) {
        // Handle HTTP request
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {

    }
}