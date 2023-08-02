package com.yilmaznaslan.ecommerce.product;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class ProductController implements HttpHandler  {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void getProduct(String id) {
        // Handle HTTP request
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {

    }
}