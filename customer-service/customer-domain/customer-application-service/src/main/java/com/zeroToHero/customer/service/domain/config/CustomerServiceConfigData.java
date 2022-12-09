package com.zeroToHero.customer.service.domain.config;

import com.zeroToHero.customer.service.domain.CustomerDomainService;
import com.zeroToHero.customer.service.domain.entity.Customer;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "customer-service")
public class CustomerServiceConfigData {
    private String customerTopicName;
    

}
