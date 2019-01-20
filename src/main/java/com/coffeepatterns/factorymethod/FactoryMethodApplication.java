package com.coffeepatterns.factorymethod;

public class FactoryMethodApplication {
    public static void main(String[] args) {
        CoffeeCreator coffeeCreator = new EspressoCreator();
        coffeeCreator.showCoffee();
    }
}
