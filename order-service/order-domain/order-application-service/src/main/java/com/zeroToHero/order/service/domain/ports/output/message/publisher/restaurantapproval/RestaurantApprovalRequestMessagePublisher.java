package com.zeroToHero.order.service.domain.ports.output.message.publisher.restaurantapproval;

import com.zeroToHero.order.service.domain.outbox.model.approval.OrderApprovalOutboxMessage;
import com.zeroToHero.outbox.OutboxStatus;

import java.util.function.BiConsumer;

public interface RestaurantApprovalRequestMessagePublisher {

    void publish(OrderApprovalOutboxMessage orderApprovalOutboxMessage,
                 BiConsumer<OrderApprovalOutboxMessage, OutboxStatus> outboxCallback);
}
