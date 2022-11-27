package com.zeroToHero.restaurant.service.domain.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
//it will be prefix that i will use in the application.yml
@ConfigurationProperties(prefix = "restaurant-service")
public class RestaurantServiceConfigData {
    private String restaurantApprovalRequestTopicName;
    private String restaurantApprovalResponseTopicName;
}
