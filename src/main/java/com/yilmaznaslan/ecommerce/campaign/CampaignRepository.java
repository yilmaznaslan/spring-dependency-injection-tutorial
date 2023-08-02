package com.yilmaznaslan.ecommerce.campaign;

import com.yilmaznaslan.ecommerce.campaign.Campaign;

public interface CampaignRepository {
    Campaign findCampaignById(String id);
}
