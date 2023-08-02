package com.yilmaznaslan.ecommerce.product;

import com.yilmaznaslan.ecommerce.product.Product;

import java.util.List;

public interface ProductRepository {
    Product findProductById(String id);
    List<Product> findProductsInStock();
    void updateProductQuantity(String id, int quantity);
    // Other methods
}