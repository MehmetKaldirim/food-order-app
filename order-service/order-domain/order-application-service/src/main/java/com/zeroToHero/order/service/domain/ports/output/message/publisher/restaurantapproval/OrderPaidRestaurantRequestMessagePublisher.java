package com.zeroToHero.order.service.domain.ports.output.message.publisher.restaurantapproval;

import com.zeroToHero.domain.event.publisher.DomainEventPublisher;
import com.zeroToHero.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
