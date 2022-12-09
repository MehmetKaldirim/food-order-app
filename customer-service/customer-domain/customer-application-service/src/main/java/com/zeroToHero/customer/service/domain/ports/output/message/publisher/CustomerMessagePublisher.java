package com.zeroToHero.customer.service.domain.ports.output.message.publisher;

import com.zeroToHero.customer.service.domain.event.CustomerCreatedEvent;

public interface CustomerMessagePublisher {

    void publish(CustomerCreatedEvent customerCreatedEvent);

}