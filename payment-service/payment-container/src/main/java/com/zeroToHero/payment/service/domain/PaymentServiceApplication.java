package com.zeroToHero.payment.service.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.zeroToHero.payment.service.dataaccess")
@EntityScan(basePackages = "com.zeroToHero.payment.service.dataaccess")
@SpringBootApplication(scanBasePackages = "com.zeroToHero.")
public class PaymentServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication.class, args);
    }
}
