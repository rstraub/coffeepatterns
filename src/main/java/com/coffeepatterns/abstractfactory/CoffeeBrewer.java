package com.coffeepatterns.abstractfactory;

import com.coffeepatterns.abstractfactory.factories.CoffeeFactory;

class CoffeeBrewer {
    private CoffeeFactory coffeeFactory;

    CoffeeBrewer(CoffeeFactory factory) {
        this.coffeeFactory = factory;
    }

    String brewEspresso() {
        return coffeeFactory.createEspresso().brew();
    }

    String brewLungo() {
        return coffeeFactory.createLungo().brew();
    }

    void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }
}
