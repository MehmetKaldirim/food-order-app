package zeroToHero.order.service.domain.event;

import com.zeroToHero.domain.event.DomainEvent;
import zeroToHero.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCancelledEvent extends OrderEvent{


    public OrderCancelledEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}