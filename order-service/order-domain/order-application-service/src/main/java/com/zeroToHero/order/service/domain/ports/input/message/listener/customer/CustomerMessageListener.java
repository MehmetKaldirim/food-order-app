package com.zeroToHero.order.service.domain.ports.input.message.listener.customer;

import com.zeroToHero.order.service.domain.dto.message.CustomerModel;

public interface CustomerMessageListener {

    void customerCreated(CustomerModel customerModel);
}
