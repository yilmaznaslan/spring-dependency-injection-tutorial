# Use case 1) Implement a promotional campaign system feature

As a product owner, I want to be able to create promotional campaigns to boost sales. Here are the steps:

- I want to create a new promotional campaign that applies a discount to certain products for a certain period of time.
- The CampaignService should have access to the ProductService to fetch and update product details.

- When a campaign is active, the OrderService should apply the campaign discount when creating an order. Therefore, the
OrderService should have access to the CampaignService.

- Customers should be notified when a campaign starts and ends. The CampaignService should use the 
  NotificationService to
send these notifications.

- I want to be able to query active campaigns, so a CampaignRepository should be created to manage campaign data.

- I want to be able to manage campaigns through a REST API, so a CampaignController should be created to handle these 
HTTP
requests. This controller should depend on the CampaignService.

You need to create new classes: 
- Campaign, 
- CampaignRepository, 
- CampaignService, and 
- CampaignController. 

Also, you'll need to modify existing classes: 
- Product, 
- ProductService, OrderService, and NotificationService.

This feature should prove challenging without a DI framework because:

- You'll need to manually create and manage instances of the new classes. If the CampaignService has dependencies, 
  you'll
need to create and pass these dependencies whenever you create a CampaignService instance. If these dependencies change
in the future, you'll have to update your code in all places where you create a CampaignService instance.

- You'll have to modify existing classes to include new dependencies. For example, OrderService will now need access to
CampaignService to check for active campaigns and apply discounts.

Writing unit tests becomes harder as you need to manually create and manage mock instances of the new dependencies.

The development and maintenance effort of this feature would be significantly reduced with a DI framework that
automatically manages dependencies.

## Bash Rest Calls

```bash
curl --location 'http://localhost:8000/customers/1'
```