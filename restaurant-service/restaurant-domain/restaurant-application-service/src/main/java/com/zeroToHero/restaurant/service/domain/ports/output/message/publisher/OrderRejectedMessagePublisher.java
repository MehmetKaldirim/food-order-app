package com.zeroToHero.restaurant.service.domain.ports.output.message.publisher;

import com.zeroToHero.domain.event.publisher.DomainEventPublisher;
import com.zeroToHero.restaurant.service.domain.event.OrderRejectedEvent;

public interface OrderRejectedMessagePublisher extends DomainEventPublisher<OrderRejectedEvent> {
}
