package com.zeroToHero.domain.event;

public interface DomainEvent <T> {
    void fire();

}
