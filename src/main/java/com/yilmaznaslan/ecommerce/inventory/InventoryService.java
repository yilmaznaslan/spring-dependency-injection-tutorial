package com.yilmaznaslan.ecommerce.inventory;

import com.yilmaznaslan.ecommerce.product.Product;
import com.yilmaznaslan.ecommerce.product.ProductRepository;

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