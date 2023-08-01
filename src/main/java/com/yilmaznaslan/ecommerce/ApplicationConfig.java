package com.yilmaznaslan.ecommerce;

import com.yilmaznaslan.ecommerce.repository.CustomerRepository;
import com.yilmaznaslan.ecommerce.repository.impl.InMemoryCustomerRepository;

import com.yilmaznaslan.ecommerce.service.CustomerService;
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

}
