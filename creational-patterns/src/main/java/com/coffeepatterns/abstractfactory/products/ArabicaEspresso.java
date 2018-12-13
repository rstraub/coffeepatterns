package com.coffeepatterns.abstractfactory.products;

public class ArabicaEspresso extends Espresso {
    @Override
    public void brew() {
        System.out.println("Brewing an arabica espresso, " + this.amount);
    }
}
