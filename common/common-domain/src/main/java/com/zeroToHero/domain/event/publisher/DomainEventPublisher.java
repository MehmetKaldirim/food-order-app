package com.zeroToHero.domain.event.publisher;

import com.zeroToHero.domain.event.DomainEvent;

public interface DomainEventPublisher <T extends DomainEvent> {

    void publish(T domainEvent);
}
