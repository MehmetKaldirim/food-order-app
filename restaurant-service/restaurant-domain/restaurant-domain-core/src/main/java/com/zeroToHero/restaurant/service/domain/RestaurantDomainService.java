package com.zeroToHero.restaurant.service.domain;

import com.zeroToHero.domain.event.publisher.DomainEventPublisher;
import com.zeroToHero.restaurant.service.domain.entity.Restaurant;
import com.zeroToHero.restaurant.service.domain.event.OrderApprovalEvent;
import com.zeroToHero.restaurant.service.domain.event.OrderApprovedEvent;
import com.zeroToHero.restaurant.service.domain.event.OrderRejectedEvent;

import java.util.List;

public interface RestaurantDomainService {

    OrderApprovalEvent validateOrder(Restaurant restaurant,
                                     List<String> failureMessages,
                                     DomainEventPublisher<OrderApprovedEvent> orderApprovedEventDomainEventPublisher,
                                     DomainEventPublisher<OrderRejectedEvent> orderRejectedEventDomainEventPublisher);
}
