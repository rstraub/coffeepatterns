package com.coffeepatterns.abstractfactory.products;

public class RobustaEspresso extends Espresso {
    @Override
    public void brew() {
        System.out.println("Brewing a robusta espresso, " + this.amount);
    }
}
