package com.yilmaznaslan.ecommerce.campaign;

import com.yilmaznaslan.ecommerce.campaign.Campaign;
import com.yilmaznaslan.ecommerce.product.Product;
import com.yilmaznaslan.ecommerce.campaign.CampaignRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryCampaignRepository implements CampaignRepository {
    private Map<String, Campaign> database;

    public InMemoryCampaignRepository() {
        database = new HashMap<>();
        // Pre-populate the "database" with some customers
        database.put("1", new Campaign(0.2f, List.of(new Product()), null, null));
    }

    @Override
    public Campaign findCampaignById(String id) {
        return database.get(id);
    }
}
