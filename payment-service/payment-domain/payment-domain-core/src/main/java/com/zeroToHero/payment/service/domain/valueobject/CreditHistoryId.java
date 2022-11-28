package com.zeroToHero.payment.service.domain.valueobject;

import com.zeroToHero.domain.valueobject.BaseId;

import java.util.UUID;

public class CreditHistoryId extends BaseId<UUID> {
    public CreditHistoryId(UUID value) {
        super(value);
    }
}

