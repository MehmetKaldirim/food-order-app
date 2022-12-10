package zeroToHero.order.service.domain;

import com.sun.xml.bind.v2.TODO;
import com.zeroToHero.order.service.domain.OrderDomainService;
import com.zeroToHero.order.service.domain.OrderDomainServiceImpl;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

        //Bean Creation of OrderDomainService  is already done inside the OrderServiceConfigData so i deleted the bean here
        //it s deleted itself:)

    @Bean
    public OrderDomainService orderDomainService() {
        return new OrderDomainServiceImpl();
    }

}
