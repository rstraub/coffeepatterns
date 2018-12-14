package com.coffeepatterns.abstractfactory.products;

public abstract class Coffee {
    private final int amount;

    Coffee(int amount) {
        this.amount = amount;
    }

    public abstract void brew();

    public int getAmount() {

        return amount;
    }
}
