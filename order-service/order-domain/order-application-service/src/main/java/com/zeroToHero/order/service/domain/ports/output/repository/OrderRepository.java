package com.zeroToHero.order.service.domain.ports.output.repository;

import zeroToHero.order.service.domain.entity.Order;
import zeroToHero.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {

    Order save(Order order);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
