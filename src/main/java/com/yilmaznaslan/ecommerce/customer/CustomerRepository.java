package com.yilmaznaslan.ecommerce.customer;

import com.yilmaznaslan.ecommerce.customer.Customer;

public interface CustomerRepository {
    Customer findCustomerById(String id);
}
