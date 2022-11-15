package com.zeroToHero.order.service.domain.valueobject;



import com.zeroToHero.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
