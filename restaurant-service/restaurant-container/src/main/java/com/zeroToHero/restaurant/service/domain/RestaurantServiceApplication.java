package com.zeroToHero.restaurant.service.domain;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.zeroToHero.restaurant.service.dataaccess", "com.zeroToHero.dataaccess" })
@EntityScan(basePackages = { "com.zeroToHero.restaurant.service.dataaccess", "com.zeroToHero.dataaccess" })
@SpringBootApplication(scanBasePackages = "com.zeroToHero")
public class RestaurantServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantServiceApplication.class, args);
    }
}
