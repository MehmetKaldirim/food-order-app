package com.zeroToHero.order.service.domain;


import com.zeroToHero.order.service.domain.dto.create.CreateOrderCommand;
import com.zeroToHero.order.service.domain.dto.create.CreateOrderResponse;
import com.zeroToHero.order.service.domain.mapper.OrderDataMapper;
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

    private final OrderDomainService orderDomainService;
    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final RestaurantRepository restaurantRepository;
    private final OrderDataMapper orderDataMapper;
    private final ApplicationDomainEventPublisher applicationDomainEventPublisher;

    public OrderCreateCommandHandler(OrderDomainService orderDomainService, OrderRepository orderRepository, CustomerRepository customerRepository, RestaurantRepository restaurantRepository, OrderDataMapper orderDataMapper, ApplicationDomainEventPublisher applicationDomainEventPublisher) {
        this.orderDomainService = orderDomainService;
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.restaurantRepository = restaurantRepository;
        this.orderDataMapper = orderDataMapper;
        this.applicationDomainEventPublisher = applicationDomainEventPublisher;
    }

    @Transactional
    public CreateOrderResponse createOrder(CreateOrderCommand createOrderCommand){
        checkCustomer(createOrderCommand.getCustomerId());
        Restaurant restaurant = checkRestaurant(createOrderCommand);
        Order order = orderDataMapper.createOrderCommandToOrder(createOrderCommand);
        OrderCreatedEvent orderCreatedEvent = orderDomainService.validateAndInitiateOrder(order, restaurant);
        Order orderResult =  saveOrder(order);

        log.info("Order is created with id : {}", orderResult.getId().getValue() );

        //now we need mapper orderToCreateOrderResponse
        return orderDataMapper.orderToCreateOrderResponse(orderResult) ;
    }

    private Restaurant checkRestaurant(CreateOrderCommand createOrderCommand) {
    //we need a mapper here CreateOrderCommand->Restaurant
        Restaurant restaurant = orderDataMapper.createOrderCommandToRestaurant(createOrderCommand);
        Optional<Restaurant>  optionalRestaurant = restaurantRepository.findRestaurantInformation(restaurant);
        if(optionalRestaurant.isEmpty()){
            log.warn("Couldnt find restaurant with restaurant id: {}", createOrderCommand.getRestaurantId());
            throw new OrderDomainException("Could not find restaurant id: " + createOrderCommand.getRestaurantId());
        }
        return optionalRestaurant.get();
    }

    private void checkCustomer(UUID customerId) {
        Optional<Customer> customer = customerRepository.findCustomer(customerId);
        if (customer.isEmpty()){
            log.warn("Couldnt find customer with customer id: {}", customerId);
            throw new OrderDomainException("Could not find customer id: " + customer);
        }
    }

    private Order saveOrder(Order order){
        Order orderResult = orderRepository.save(order);
        if (orderResult == null) {
            log.error("Order could not save order!!!");
            throw new OrderDomainException("Order could not save order!!!");
        }
        log.info("Order saved with id: {}", orderResult.getId().getValue());
        return orderResult;
    }
}
