package com.coffeepatterns.abstractfactory.products;

public abstract class Coffee {
    int amount;

    public Coffee(int amount) {
        this.amount = amount;
    }

    public abstract void brew();
}
