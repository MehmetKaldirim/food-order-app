package com.zeroToHero.payment.service.domain.valueobject;

import com.zeroToHero.domain.valueobject.BaseId;

import java.util.UUID;

public class CreditEntryId extends BaseId<UUID> {
    public CreditEntryId(UUID value) {
        super(value);
    }
}
