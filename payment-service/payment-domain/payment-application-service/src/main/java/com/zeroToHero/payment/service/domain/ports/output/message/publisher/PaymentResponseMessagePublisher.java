package com.zeroToHero.payment.service.domain.ports.output.message.publisher;

import com.zeroToHero.outbox.OutboxStatus;
import com.zeroToHero.payment.service.domain.outbox.model.OrderOutboxMessage;

import java.util.function.BiConsumer;

public interface PaymentResponseMessagePublisher {
    void publish(OrderOutboxMessage orderOutboxMessage,
                 BiConsumer<OrderOutboxMessage, OutboxStatus> outboxCallback);
}
