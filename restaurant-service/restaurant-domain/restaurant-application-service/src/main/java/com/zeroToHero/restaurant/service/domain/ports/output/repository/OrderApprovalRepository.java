package com.zeroToHero.restaurant.service.domain.ports.output.repository;

import com.zeroToHero.restaurant.service.domain.entity.OrderApproval;

public interface OrderApprovalRepository {
    OrderApproval save(OrderApproval orderApproval);
}
