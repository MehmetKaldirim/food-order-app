package com.zeroToHero.order.service.domain.ports.output.repository;

import com.zeroToHero.domain.valueobject.OrderId;
import com.zeroToHero.order.service.domain.entity.Order;
import com.zeroToHero.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {

    Order save(Order order);

    Optional<Order> findById(OrderId orderId);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
