package com.coffeepatterns.builder;

public class FrenchPressBuilder extends CoffeeBuilder {
    private FrenchPressedCoffee coffee;

    @Override
    void addBeans() {
        this.coffee = new FrenchPressedCoffee();
        this.coffee.addBeans();
    }

    @Override
    void addWater() {
        this.coffee.addWater();
    }

    @Override
    void brew() {
        this.coffee.brew();
    }

    FrenchPressedCoffee getResult() {
        return this.coffee;
    }
}
