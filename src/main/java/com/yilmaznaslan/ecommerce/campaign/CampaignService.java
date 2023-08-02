package com.yilmaznaslan.ecommerce.campaign;

import com.yilmaznaslan.ecommerce.product.ProductService;

public class CampaignService {

    private final ProductService productService;
    private final CampaignRepository campaignRepository;

    public CampaignService(ProductService productService, CampaignRepository campaignRepository) {
        this.productService = productService;
        this.campaignRepository = campaignRepository;
    }
}
