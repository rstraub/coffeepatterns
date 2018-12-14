package com.coffeepatterns.factorymethod;

public class EspressoCreator extends CoffeeCreator {
    @Override
    public Coffee createCoffee() {
        return new Espresso("arabica");
    }
}
