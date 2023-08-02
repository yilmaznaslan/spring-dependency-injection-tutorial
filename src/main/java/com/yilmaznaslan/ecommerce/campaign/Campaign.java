package com.yilmaznaslan.ecommerce.campaign;

import com.yilmaznaslan.ecommerce.product.Product;

import java.time.Duration;
import java.util.List;

public class Campaign {

    private float discount;
    private List<Product> productList;
    private Duration startTime;
    private Duration endTime;

    public Campaign(float discount, List<Product> productList, Duration startTime, Duration endTime) {
        this.discount = discount;
        this.productList = productList;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
