package com.zeroToHero.restaurant.service.domain.ports.output.message.publisher;

import com.zeroToHero.outbox.OutboxStatus;
import com.zeroToHero.restaurant.service.domain.outbox.model.OrderOutboxMessage;

import java.util.function.BiConsumer;

public interface RestaurantApprovalResponseMessagePublisher {

    void publish(OrderOutboxMessage orderOutboxMessage,
                 BiConsumer<OrderOutboxMessage, OutboxStatus> outboxCallback);
}
