package com.coffeepatterns.abstractfactory.products;

public class RobustaEspresso extends Espresso {
    @Override
    public String brew() {
        return "Brewing a robusta espresso, " + this.getAmount();
    }
}
