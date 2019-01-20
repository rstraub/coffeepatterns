package com.coffeepatterns.abstractfactory.products;

public class ArabicaEspresso extends Espresso {
    @Override
    public String brew() {
        return "Brewing an arabica espresso, " + this.getAmount();
    }
}
