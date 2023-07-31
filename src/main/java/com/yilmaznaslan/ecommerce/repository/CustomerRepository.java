package com.yilmaznaslan.ecommerce.repository;

import com.yilmaznaslan.ecommerce.model.Customer;

public interface CustomerRepository {
    Customer findCustomerById(String id);
}
