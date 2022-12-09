package com.zeroToHero.customer.service.domain;

import com.zeroToHero.customer.service.domain.entity.Customer;
import com.zeroToHero.customer.service.domain.event.CustomerCreatedEvent;

public interface CustomerDomainService {

    CustomerCreatedEvent validateAndInitiateCustomer(Customer customer);

}
