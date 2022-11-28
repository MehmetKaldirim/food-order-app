package com.zeroToHero.payment.service.domain.exception;

import com.zeroToHero.domain.exception.DomainException;
public class PaymentNotFoundException extends DomainException {

    public PaymentNotFoundException(String message) {
        super(message);
    }

    public PaymentNotFoundException(String message, Throwable cause) {
        super(message);
    }
}
