package com.zeroToHero.order.service.domain;

import lombok.extern.slf4j.Slf4j;
import com.zeroToHero.order.service.domain.entity.Order;
import com.zeroToHero.order.service.domain.entity.Product;
import com.zeroToHero.order.service.domain.entity.Restaurant;
import com.zeroToHero.order.service.domain.event.OrderCancelledEvent;
import com.zeroToHero.order.service.domain.event.OrderCreatedEvent;
import com.zeroToHero.order.service.domain.event.OrderPaidEvent;
import com.zeroToHero.order.service.domain.exception.OrderDomainException;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import static com.zeroToHero.domain.DomainConstants.UTC;

@Slf4j
public class OrderDomainServiceImpl implements  OrderDomainService{

    @Override
    public OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant) {
        validateRestaurant(restaurant);
        setOrderProductInformation(order, restaurant);
        order.validateOrder();
        order.initializeOrder();
        log.info("Order with id: {} is initiated", order.getId().getValue());
        return new OrderCreatedEvent(order, ZonedDateTime.now(ZoneId.of(UTC)));
        //Universal Time Coordinated  we are using here
    }



    @Override
    public OrderPaidEvent payOrder(Order order) {
        order.pay();
        log.info("Order with id: {} is paid", order.getId().getValue());
        return new OrderPaidEvent(order, ZonedDateTime.now(ZoneId.of(UTC)));
    }

    @Override
    public void approveOrder(Order order) {
        order.approve();
        log.info("Order with id: {} is approved", order.getId().getValue());
    }

    @Override
    public OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages) {
        order.initCancel(failureMessages);
        log.info("Order payment is cancelling for order id: {}", order.getId().getValue());
        return new OrderCancelledEvent(order, ZonedDateTime.now(ZoneId.of(UTC)));
    }

    @Override
    public void cancelOrder(Order order, List<String> failureMessages) {
        order.cancel(failureMessages);
        log.info("Order with id: {} is cancelled", order.getId().getValue());

    }

    public void validateRestaurant (Restaurant restaurant){
        if(!restaurant.isActive()){
            throw new OrderDomainException("Restaurant with id " + restaurant.getId().getValue()
                    + " is currently not active!");
        }
    }

    private void setOrderProductInformation(Order order, Restaurant restaurant) {
        order.getItems().forEach(orderItem->restaurant.getProducts().forEach(restaurantProduct->{
            Product currentProduct = orderItem.getProduct();
            if (currentProduct.equals(restaurantProduct)){
                currentProduct.updateWithConfirmedNameAndPrice(restaurantProduct.getName(),restaurantProduct.getPrice());
            }
        }));
    }
}
