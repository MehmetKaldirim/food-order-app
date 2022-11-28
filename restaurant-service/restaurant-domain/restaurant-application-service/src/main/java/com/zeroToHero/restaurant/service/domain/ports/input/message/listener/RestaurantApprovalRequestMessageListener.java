package com.zeroToHero.restaurant.service.domain.ports.input.message.listener;

import com.zeroToHero.restaurant.service.domain.dto.RestaurantApprovalRequest;

public interface RestaurantApprovalRequestMessageListener {
    void approveOrder(RestaurantApprovalRequest restaurantApprovalRequest);
}
