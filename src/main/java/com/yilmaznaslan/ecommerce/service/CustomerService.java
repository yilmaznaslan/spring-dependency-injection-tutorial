package com.yilmaznaslan.ecommerce.service;

import com.yilmaznaslan.ecommerce.model.Customer;
import com.yilmaznaslan.ecommerce.repository.CustomerRepository;

public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(String id) {
        return customerRepository.findCustomerById(id);
    }
}
