package com.zeroToHero.order.service.domain.config;

import com.zeroToHero.order.service.domain.OrderDomainService;
import com.zeroToHero.order.service.domain.OrderDomainServiceImpl;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "order-service")
public class OrderServiceConfigData {
    private String paymentRequestTopicName;
    private String paymentResponseTopicName;
    private String restaurantApprovalRequestTopicName;
    private String restaurantApprovalResponseTopicName;

}
