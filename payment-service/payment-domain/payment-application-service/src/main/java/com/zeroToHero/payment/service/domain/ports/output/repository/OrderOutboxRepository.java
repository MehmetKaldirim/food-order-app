package com.zeroToHero.payment.service.domain.ports.output.repository;

import com.zeroToHero.domain.valueobject.PaymentStatus;
import com.zeroToHero.outbox.OutboxStatus;
import com.zeroToHero.payment.service.domain.outbox.model.OrderOutboxMessage;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//Normally we are using annotation in implementation class but strangely not work here
@Component
public interface OrderOutboxRepository {
    OrderOutboxMessage save(OrderOutboxMessage orderOutboxMessage);

    Optional<List<OrderOutboxMessage>> findByTypeAndOutboxStatus(String type, OutboxStatus status);

    Optional<OrderOutboxMessage> findByTypeAndSagaIdAndPaymentStatusAndOutboxStatus(String type,
                                                                                    UUID sagaId,
                                                                                    PaymentStatus paymentStatus,
                                                                                    OutboxStatus outboxStatus);
    void deleteByTypeAndOutboxStatus(String type, OutboxStatus status);
}
