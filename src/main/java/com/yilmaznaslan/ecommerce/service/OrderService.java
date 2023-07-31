package com.yilmaznaslan.ecommerce.service;

import com.yilmaznaslan.ecommerce.repository.OrderRepository;

import java.util.List;

public class OrderService {
    private OrderRepository orderRepository;
    private CustomerService customerService;
    private ProductService productService;
    private PaymentProcessor paymentProcessor;
    private InventoryService inventoryService;
    private ShippingService shippingService;
    private NotificationService notificationService;
    private CampaignService campaignService;

    public OrderService(OrderRepository orderRepository, CustomerService customerService, ProductService productService,
                        PaymentProcessor paymentProcessor, InventoryService inventoryService, ShippingService shippingService,
                        NotificationService notificationService, CampaignService campaignService) {
        this.orderRepository = orderRepository;
        this.customerService = customerService;
        this.productService = productService;
        this.paymentProcessor = paymentProcessor;
        this.inventoryService = inventoryService;
        this.shippingService = shippingService;
        this.notificationService = notificationService;
        this.campaignService = campaignService;
    }

    public void createOrder(String customerId, List<String> productIds) {
        // Business logic
    }

    public void refundOrder(String orderId) {
        // Business logic
    }
}