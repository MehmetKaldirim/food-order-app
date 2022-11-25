package com.zeroToHero.payment.service.domain.ports.output.message.publisher;

import com.zeroToHero.domain.event.publisher.DomainEventPublisher;
import com.zeroToHero.payment.service.domain.event.PaymentCancelledEvent;

public interface PaymentCancelledMessagePublisher extends DomainEventPublisher<PaymentCancelledEvent> {
}
