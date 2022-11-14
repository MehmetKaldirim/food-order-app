package com.zeroToHero.order.service.domain;


import com.zeroToHero.order.service.domain.dto.create.CreateOrderCommand;
import com.zeroToHero.order.service.domain.dto.create.CreateOrderResponse;
import com.zeroToHero.order.service.domain.mapper.OrderDataMapper;
import com.zeroToHero.order.service.domain.ports.output.message.publisher.payment.OrderCreatedPaymentRequestMessagePublisher;
import com.zeroToHero.order.service.domain.ports.output.repository.CustomerRepository;
import com.zeroToHero.order.service.domain.ports.output.repository.OrderRepository;
import com.zeroToHero.order.service.domain.ports.output.repository.RestaurantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import zeroToHero.order.service.domain.OrderDomainService;
import zeroToHero.order.service.domain.entity.Customer;
import zeroToHero.order.service.domain.entity.Order;
import zeroToHero.order.service.domain.entity.Restaurant;
import zeroToHero.order.service.domain.event.OrderCreatedEvent;
import zeroToHero.order.service.domain.exception.OrderDomainException;

import java.util.Optional;
import java.util.UUID;

@Slf4j
@Component
public class OrderCreateCommandHandler {

    private final OrderCreateHelper orderCreateHelper;
    private final OrderDataMapper orderDataMapper;
    private final OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher;

    public OrderCreateCommandHandler(OrderCreateHelper orderCreateHelper, OrderDataMapper orderDataMapper, OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher) {
        this.orderCreateHelper = orderCreateHelper;
        this.orderDataMapper = orderDataMapper;
        this.orderCreatedPaymentRequestMessagePublisher = orderCreatedPaymentRequestMessagePublisher;
    }



    public CreateOrderResponse createOrder(CreateOrderCommand createOrderCommand){
        OrderCreatedEvent orderCreatedEvent = orderCreateHelper.persistOrder(createOrderCommand);
        log.info("Order is created with id: {}", orderCreatedEvent.getOrder().getId().getValue());
        orderCreatedPaymentRequestMessagePublisher.publish(orderCreatedEvent);
        return orderDataMapper.orderToCreateOrderResponse(orderCreatedEvent.getOrder()) ;
    }

   }
