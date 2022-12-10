package com.zeroToHero.customer.service;

import com.zeroToHero.customer.service.domain.CustomerDomainService;
import com.zeroToHero.customer.service.domain.CustomerDomainServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfiguration {

    @Bean
    public CustomerDomainService customerDomainService(){
        return new CustomerDomainServiceImpl();
    }
}
