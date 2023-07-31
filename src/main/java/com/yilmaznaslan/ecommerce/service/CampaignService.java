package com.yilmaznaslan.ecommerce.service;

import com.yilmaznaslan.ecommerce.repository.CampaignRepository;

public class CampaignService {

    private final ProductService productService;
    private final CampaignRepository campaignRepository;

    public CampaignService(ProductService productService, CampaignRepository campaignRepository) {
        this.productService = productService;
        this.campaignRepository = campaignRepository;
    }
}
