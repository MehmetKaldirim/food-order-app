package com.zeroToHero.payment.service.domain.ports.input.message.listener;

import com.zeroToHero.payment.service.domain.dto.PaymentRequest;

public interface PaymentRequestMessageListener {

    void completePayment(PaymentRequest paymentRequest);

    void cancelPayment(PaymentRequest paymentRequest);
}
