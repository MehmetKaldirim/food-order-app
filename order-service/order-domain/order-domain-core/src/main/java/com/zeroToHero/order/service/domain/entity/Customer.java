package com.zeroToHero.order.service.domain.entity;

import com.zeroToHero.domain.entity.AggregateRoot;
import com.zeroToHero.domain.valueobject.CustomerId;

public class Customer extends AggregateRoot<CustomerId> {
    public Customer() {
    }

    public Customer(CustomerId customerId) {
        super.setId(customerId);
    }
}
