package com.coffeepatterns.factorymethod;

public abstract class CoffeeCreator {
    public abstract Coffee createCoffee();

    public void showCoffee() {
        Coffee coffee = createCoffee();
        System.out.println(coffee.toString());
    }
}
