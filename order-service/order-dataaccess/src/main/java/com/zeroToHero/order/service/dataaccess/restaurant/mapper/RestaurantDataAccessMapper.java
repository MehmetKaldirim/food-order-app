package com.zeroToHero.order.service.dataaccess.restaurant.mapper;

import com.zeroToHero.dataaccess.restaurant.entity.RestaurantEntity;
import com.zeroToHero.dataaccess.restaurant.exception.RestaurantDataAccessException;
import com.zeroToHero.domain.valueobject.Money;
import com.zeroToHero.domain.valueobject.ProductId;
import com.zeroToHero.domain.valueobject.RestaurantId;
import com.zeroToHero.order.service.domain.entity.Product;
import com.zeroToHero.order.service.domain.entity.Restaurant;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class RestaurantDataAccessMapper {

    public List<UUID> restaurantToRestaurantProducts(Restaurant restaurant) {
        return restaurant.getProducts().stream()
                .map(product -> product.getId().getValue())
                .collect(Collectors.toList());
    }

    public Restaurant restaurantEntityToRestaurant(List<RestaurantEntity> restaurantEntities) {
        RestaurantEntity restaurantEntity =
                restaurantEntities.stream().findFirst().orElseThrow(() ->
                        new RestaurantDataAccessException("Restaurant could not be found!"));

        List<Product> restaurantProducts = restaurantEntities.stream().map(entity ->
                new Product(new ProductId(entity.getProductId()), entity.getProductName(),
                        new Money(entity.getProductPrice()))).collect(Collectors.toList());

        //toList() there is only to list here

        return Restaurant.builder()
                .restaurantId(new RestaurantId(restaurantEntity.getRestaurantId()))
                .products(restaurantProducts)
                .active(restaurantEntity.getRestaurantActive())
                .build();
    }
}
