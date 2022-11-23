package com.zeroToHero.order.service.dataaccess.customer.mapper;

import com.zeroToHero.order.service.dataaccess.customer.entity.CustomerEntity;
import com.zeroToHero.domain.valueobject.CustomerId;
import com.zeroToHero.order.service.domain.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDataAccessMapper {

    public Customer customerEntityToCustomer(CustomerEntity customerEntity) {
        return new Customer(new CustomerId(customerEntity.getId()));
    }
}
