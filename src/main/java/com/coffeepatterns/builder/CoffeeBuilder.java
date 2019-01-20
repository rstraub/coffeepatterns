package com.coffeepatterns.builder;

public abstract class CoffeeBuilder {
    abstract void addBeans();

    abstract void addWater();

    abstract void brew();
}
