package com.zeroToHero.order.service.domain.exception;

import com.zeroToHero.domain.exception.DomainException;

public class OrderDomainException extends DomainException {
    public OrderDomainException(String message) {
        super(message);
    }

    public OrderDomainException(Throwable cause) {
        super(cause);
    }
}
