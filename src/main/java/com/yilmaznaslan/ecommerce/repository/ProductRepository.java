package com.yilmaznaslan.ecommerce.repository;

import com.yilmaznaslan.ecommerce.model.Product;

import java.util.List;

public interface ProductRepository {
    Product findProductById(String id);
    List<Product> findProductsInStock();
    void updateProductQuantity(String id, int quantity);
    // Other methods
}