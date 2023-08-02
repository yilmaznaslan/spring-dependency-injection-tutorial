package com.yilmaznaslan.ecommerce.order;

import com.yilmaznaslan.ecommerce.customer.CustomerService;
import com.yilmaznaslan.ecommerce.payment.PaymentService;
import com.yilmaznaslan.ecommerce.product.ProductService;

import java.util.List;

public class OrderService {
    private final OrderRepository orderRepository;
    private final CustomerService customerService;
    private final ProductService productService;
    private final PaymentService paymentService;

    public OrderService(OrderRepository orderRepository, CustomerService customerService, ProductService productService,
                        PaymentService paymentService) {
        this.orderRepository = orderRepository;
        this.customerService = customerService;
        this.productService = productService;
        this.paymentService = paymentService;
    }

    public void createOrder(String customerId, List<String> productIds) {
        // Business logic
    }

    public void refundOrder(String orderId) {
        // Business logic
    }
}