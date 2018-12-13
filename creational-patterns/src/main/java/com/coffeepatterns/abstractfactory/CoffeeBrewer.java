package com.coffeepatterns.abstractfactory;

import com.coffeepatterns.abstractfactory.factories.CoffeeFactory;

public class CoffeeBrewer {
    private CoffeeFactory coffeeFactory;

    public CoffeeBrewer(CoffeeFactory factory) {
        this.coffeeFactory = factory;
    }

    public void brewCoffees() {
        coffeeFactory.createEspresso().brew();
        coffeeFactory.createLungo().brew();
    }

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }
}
