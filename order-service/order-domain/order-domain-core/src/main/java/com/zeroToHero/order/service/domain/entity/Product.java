package com.zeroToHero.order.service.domain.entity;

import com.zeroToHero.domain.entity.BaseEntity;
import com.zeroToHero.domain.valueobject.Money;
import com.zeroToHero.domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {

    private String name;
    private Money price;

    public Product(ProductId productId, String name, Money prica) {
        super.setId(productId);
        this.name = name;
        this.price = prica;
    }
    public Product(ProductId productId) {
        super.setId(productId);
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }

    public void updateWithConfirmedNameAndPrice(String name, Money price) {
        this.name = name;
        this.price = price;
    }
}
