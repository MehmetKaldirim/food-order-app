package com.zeroToHero.payment.service.domain.ports.output.repository;

import com.zeroToHero.domain.valueobject.CustomerId;
import com.zeroToHero.payment.service.domain.entity.CreditEntry;

import java.util.Optional;

public interface CreditEntryRepository {

    CreditEntry save(CreditEntry creditEntry);

    Optional<CreditEntry> findByCustomerId(CustomerId customerId);
}
