package com.yilmaznaslan.ecommerce.repository;

import com.yilmaznaslan.ecommerce.model.Campaign;

public interface CampaignRepository {
    Campaign findCampaignById(String id);
}
