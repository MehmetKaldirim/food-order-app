package com.zeroToHero.order.service.domain.ports.output.message.publisher.payment;

import com.zeroToHero.domain.event.publisher.DomainEventPublisher;
import zeroToHero.order.service.domain.event.OrderCreatedEvent;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {

}
