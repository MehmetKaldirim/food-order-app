package com.zeroToHero.order.service.domain.event;


import com.zeroToHero.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCreatedEvent extends OrderEvent {



    public OrderCreatedEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);

    }

}
