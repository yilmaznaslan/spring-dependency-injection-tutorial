package com.yilmaznaslan.ecommerce;

import com.sun.net.httpserver.HttpServer;
import com.yilmaznaslan.ecommerce.controller.CustomerController;
import com.yilmaznaslan.ecommerce.controller.OrderController;
import com.yilmaznaslan.ecommerce.repository.CampaignRepository;
import com.yilmaznaslan.ecommerce.repository.CustomerRepository;
import com.yilmaznaslan.ecommerce.repository.OrderRepository;
import com.yilmaznaslan.ecommerce.repository.ProductRepository;
import com.yilmaznaslan.ecommerce.repository.impl.InMemoryCampaignRepository;
import com.yilmaznaslan.ecommerce.repository.impl.InMemoryCustomerRepository;
import com.yilmaznaslan.ecommerce.repository.impl.InMemoryOrderRepository;
import com.yilmaznaslan.ecommerce.repository.impl.InMemoryProductRepository;
import com.yilmaznaslan.ecommerce.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;

public class MainApplication {
    private static final Logger logger = LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args) throws IOException {
        logger.info("Starting the main application");
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);


        // Managing dependencies for CustomerController
        CustomerRepository customerRepository = new InMemoryCustomerRepository();
        CustomerService customerService = new CustomerService(customerRepository);
        server.createContext("/customers", new CustomerController(customerService));

        // Managing dependencies for OrderController
        ProductRepository productRepository = new InMemoryProductRepository();
        OrderRepository orderRepository = new InMemoryOrderRepository();
        ProductService productService = new ProductService();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        InventoryService inventoryService = new InventoryService(productRepository);
        ShippingService shippingService = new ShippingService();
        NotificationService notificationService = new NotificationService();
        CampaignRepository campaignRepository = new InMemoryCampaignRepository();
        CampaignService campaignService = new CampaignService(productService, campaignRepository);

        OrderService orderService = new OrderService(orderRepository, customerService, productService,
                paymentProcessor, inventoryService, shippingService, notificationService, campaignService);


         // Registering the Contexts
        server.createContext("/orders", new OrderController(orderService));
        server.createContext("/customers", new CustomerController(customerService));
        server.setExecutor(null); // creates a default executor
        server.start();
    }

}
