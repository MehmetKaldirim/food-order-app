package com.zeroToHero.customer.service.domain.ports.output.repository;

import com.zeroToHero.customer.service.domain.entity.Customer;

public interface CustomerRepository {

    Customer createCustomer(Customer customer);
}
