package com.yilmaznaslan.ecommerce;

import com.sun.net.httpserver.HttpServer;
import com.yilmaznaslan.ecommerce.customer.CustomerController;
import com.yilmaznaslan.ecommerce.customer.CustomerRepository;
import com.yilmaznaslan.ecommerce.customer.CustomerService;
import com.yilmaznaslan.ecommerce.customer.InMemoryCustomerRepository;
import com.yilmaznaslan.ecommerce.order.InMemoryOrderRepository;
import com.yilmaznaslan.ecommerce.order.OrderController;
import com.yilmaznaslan.ecommerce.order.OrderRepository;
import com.yilmaznaslan.ecommerce.order.OrderService;
import com.yilmaznaslan.ecommerce.payment.PaymentService;
import com.yilmaznaslan.ecommerce.product.ProductService;
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
        OrderRepository orderRepository = new InMemoryOrderRepository();
        ProductService productService = new ProductService();
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(orderRepository, customerService, productService, paymentService);

        // Registering the Contexts
        server.createContext("/orders", new OrderController(orderService));
        server.createContext("/customers", new CustomerController(customerService));
        server.setExecutor(null); // creates a default executor
        server.start();
    }

}
