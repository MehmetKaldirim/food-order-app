package com.zeroToHero.order.service.domain.ports.output.message.publisher.payment;

import com.zeroToHero.order.service.domain.outbox.model.payment.OrderPaymentOutboxMessage;
import com.zeroToHero.outbox.OutboxStatus;

import java.util.function.BiConsumer;

public interface PaymentRequestMessagePublisher {

    void publish(OrderPaymentOutboxMessage orderPaymentOutboxMessage,
                 BiConsumer<OrderPaymentOutboxMessage, OutboxStatus> outboxCallback);

    //BiConsumer it accept two parameter (as generic) and return void

}
