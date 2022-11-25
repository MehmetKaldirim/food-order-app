package com.zeroToHero.payment.service.domain.mapper;
import com.zeroToHero.domain.valueobject.CustomerId;
import com.zeroToHero.domain.valueobject.Money;
import com.zeroToHero.domain.valueobject.OrderId;
import com.zeroToHero.payment.service.domain.dto.PaymentRequest;
import org.springframework.stereotype.Component;

import java.util.UUID;

import com.zeroToHero.payment.service.domain.entity.Payment;
@Component
public class PaymentDataMapper {

    public Payment paymentRequestModelToPayment(PaymentRequest paymentRequest) {
        return Payment.builder()
                .orderId(new OrderId(UUID.fromString(paymentRequest.getOrderId())))
                .customerId(new CustomerId(UUID.fromString(paymentRequest.getCustomerId())))
                .price(new Money(paymentRequest.getPrice()))
                .build();

    }
}
