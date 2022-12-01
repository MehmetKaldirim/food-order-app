package com.zeroToHero.outbox;

public interface OutboxScheduler {
    void processOutboxMessage();
}
