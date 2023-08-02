package com.yilmaznaslan.ecommerce;

import com.yilmaznaslan.ecommerce.customer.CustomerRepository;
import com.yilmaznaslan.ecommerce.customer.CustomerService;
import com.yilmaznaslan.ecommerce.customer.InMemoryCustomerRepository;
import com.yilmaznaslan.ecommerce.order.InMemoryOrderRepository;
import com.yilmaznaslan.ecommerce.order.OrderRepository;
import com.yilmaznaslan.ecommerce.order.OrderService;
import com.yilmaznaslan.ecommerce.payment.PaymentService;
import com.yilmaznaslan.ecommerce.product.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public CustomerRepository customerRepository() {
        return new InMemoryCustomerRepository();
    }

    @Bean
    public CustomerService customerService() {
        return new CustomerService(customerRepository());
    }

    @Bean
    public PaymentService paymentService() {
        return new PaymentService();
    }

    @Bean
    public OrderRepository orderRepository() {
        return new InMemoryOrderRepository();
    }

    @Bean
    public ProductService productService() {
        return new ProductService();
    }

    @Bean
    public OrderService orderService() {
        return new OrderService(orderRepository(), customerService(), productService(), paymentService());
    }

}