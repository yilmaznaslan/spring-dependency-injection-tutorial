package com.yilmaznaslan.ecommerce.order;

import com.yilmaznaslan.ecommerce.campaign.CampaignService;
import com.yilmaznaslan.ecommerce.customer.CustomerService;
import com.yilmaznaslan.ecommerce.inventory.InventoryService;
import com.yilmaznaslan.ecommerce.notification.NotificationService;
import com.yilmaznaslan.ecommerce.payment.PaymentService;
import com.yilmaznaslan.ecommerce.product.ProductService;
import com.yilmaznaslan.ecommerce.shipping.ShippingService;

import java.util.List;

public class OrderService {
    private OrderRepository orderRepository;
    private CustomerService customerService;
    private ProductService productService;
    private PaymentService paymentService;
    private InventoryService inventoryService;
    private ShippingService shippingService;
    private NotificationService notificationService;
    private CampaignService campaignService;

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