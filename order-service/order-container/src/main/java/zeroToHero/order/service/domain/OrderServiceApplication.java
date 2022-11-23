package zeroToHero.order.service.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = { "com.zeroToHero.order.service.dataaccess"})
@EntityScan(basePackages = { "com.zeroToHero.order.service.dataaccess", "com.zeroToHero.dataaccess"})
@SpringBootApplication(scanBasePackages = "com.zeroToHero")
public class OrderServiceApplication {
    public static void main(String[] args) {
      SpringApplication.run(OrderServiceApplication.class, args);
    }
}
