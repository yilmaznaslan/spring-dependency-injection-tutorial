package com.yilmaznaslan.ecommerce.service;

import com.yilmaznaslan.ecommerce.model.Product;
import com.yilmaznaslan.ecommerce.repository.ProductRepository;

import java.util.List;

public class InventoryService {
    private ProductRepository productRepository;

    public InventoryService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAvailableProducts() {
        return productRepository.findProductsInStock();
    }

    public void reduceProductQuantity(String productId, int quantity) {
        productRepository.updateProductQuantity(productId, quantity);
    }

    public void increaseProductQuantity(String productId, int quantity) {
        productRepository.updateProductQuantity(productId, quantity);
    }
}