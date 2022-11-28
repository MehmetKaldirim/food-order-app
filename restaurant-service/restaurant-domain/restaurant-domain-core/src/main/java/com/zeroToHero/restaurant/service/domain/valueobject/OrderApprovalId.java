package com.zeroToHero.restaurant.service.domain.valueobject;

import com.zeroToHero.domain.valueobject.BaseId;

import java.util.UUID;

public class OrderApprovalId extends BaseId<UUID> {
    public OrderApprovalId(UUID value) {
        super(value);
    }
}
