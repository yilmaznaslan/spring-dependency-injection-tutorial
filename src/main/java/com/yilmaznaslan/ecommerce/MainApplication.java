package com.yilmaznaslan.ecommerce;

import com.sun.net.httpserver.HttpServer;
import com.yilmaznaslan.ecommerce.customer.CustomerController;
import com.yilmaznaslan.ecommerce.customer.CustomerService;
import com.yilmaznaslan.ecommerce.order.OrderController;
import com.yilmaznaslan.ecommerce.order.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.net.InetSocketAddress;

public class MainApplication {
    private static final Logger logger = LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args) throws IOException {
        logger.info("Starting the main application");
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        // Managing dependencies
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        CustomerService customerService = context.getBean(CustomerService.class);
        OrderService orderService = context.getBean(OrderService.class);

        // Registering the Contexts
        server.createContext("/orders", new OrderController(orderService));
        server.createContext("/customers", new CustomerController(customerService));
        server.start();
    }

}
