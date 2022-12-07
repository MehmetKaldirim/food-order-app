package com.zeroToHero.order.service.domain.event;

import com.zeroToHero.domain.event.publisher.DomainEventPublisher;
import com.zeroToHero.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCancelledEvent extends OrderEvent {
    public OrderCancelledEvent(Order order,
                               ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
