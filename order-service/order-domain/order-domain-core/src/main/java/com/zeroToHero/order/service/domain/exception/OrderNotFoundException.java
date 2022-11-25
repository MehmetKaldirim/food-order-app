package com.zeroToHero.order.service.domain.exception;

public class OrderNotFoundException extends DomainException {
    public OrderNotFoundException(String message) {
        super(message);
    }

    public OrderNotFoundException(Throwable cause) {
        super(cause);
    }
}
