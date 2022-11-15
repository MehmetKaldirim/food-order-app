package com.zeroToHero.order.service.domain.valueobject;

import com.zeroToHero.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
