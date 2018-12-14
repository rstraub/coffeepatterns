package com.coffeepatterns.builder;

public class EspressoBuilder extends CoffeeBuilder {
    private Espresso espresso;

    @Override
    void addBeans() {
        this.espresso = new Espresso();
        this.espresso.addBeans();
    }

    @Override
    void addWater() {
        this.espresso.addWater();
    }

    @Override
    void brew() {
        this.espresso.brew();
    }

    Espresso getResult() {
        return this.espresso;
    }
}
