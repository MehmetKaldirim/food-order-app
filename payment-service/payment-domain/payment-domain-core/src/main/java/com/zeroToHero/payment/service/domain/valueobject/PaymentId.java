package com.zeroToHero.payment.service.domain.valueobject;

import com.zeroToHero.domain.valueobject.BaseId;

import java.util.UUID;

public class PaymentId extends BaseId<UUID> {

    public PaymentId(UUID value) {
        super(value);
    }
}
