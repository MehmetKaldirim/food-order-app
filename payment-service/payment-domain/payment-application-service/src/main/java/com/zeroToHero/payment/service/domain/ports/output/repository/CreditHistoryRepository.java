package com.zeroToHero.payment.service.domain.ports.output.repository;

import com.zeroToHero.domain.valueobject.CustomerId;
import com.zeroToHero.payment.service.domain.entity.CreditHistory;

import java.util.List;
import java.util.Optional;

public interface CreditHistoryRepository {

    CreditHistory save(CreditHistory creditHistory);

    Optional<List<CreditHistory>> findByCustomerId(CustomerId customerId);
}
