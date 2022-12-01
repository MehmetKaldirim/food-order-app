package com.zeroToHero.saga;

import com.zeroToHero.domain.event.DomainEvent;

public interface SagaStep <T>{
    void process(T data);
    void rollback(T data);
}
