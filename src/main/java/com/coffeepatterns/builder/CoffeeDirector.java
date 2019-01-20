package com.coffeepatterns.builder;

public class CoffeeDirector {
    private CoffeeBuilder builder;

    CoffeeDirector(CoffeeBuilder builder) {
        this.builder = builder;
    }

    void construct() {
        this.builder.addBeans();
        this.builder.addWater();
        this.builder.brew();
    }
}
