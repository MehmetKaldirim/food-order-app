package com.zeroToHero.customer.service.domain.exception;

import com.zeroToHero.domain.exception.DomainException;

public class CustomerDomainException extends DomainException {

    public CustomerDomainException(String message) {
        super(message);
    }
}
