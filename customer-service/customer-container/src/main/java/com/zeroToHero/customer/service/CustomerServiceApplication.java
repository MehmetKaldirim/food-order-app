package com.zeroToHero.customer.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.zeroToHero.customer.service.dataaccess","com.zeroToHero.dataaccess"})
@EntityScan(basePackages = { "com.zeroToHero.order.customer.dataaccess", "com.zeroToHero.dataaccess"})
@SpringBootApplication(scanBasePackages = "com.zeroToHero")
public class CustomerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class,args);
    }
}
