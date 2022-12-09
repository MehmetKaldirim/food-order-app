package com.zeroToHero.customer.service.domain.ports.input.service;

import com.zeroToHero.customer.service.domain.create.CreateCustomerCommand;
import com.zeroToHero.customer.service.domain.create.CreateCustomerResponse;

import javax.validation.Valid;

public interface CustomerApplicationService {

    CreateCustomerResponse createCustomer(@Valid CreateCustomerCommand createCustomerCommand);
    //valid annotation is enable validation of the field using spring annotation

}
