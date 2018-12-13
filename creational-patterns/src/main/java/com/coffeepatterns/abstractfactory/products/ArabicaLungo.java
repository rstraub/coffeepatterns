package com.coffeepatterns.abstractfactory.products;

public class ArabicaLungo extends Lungo {
    @Override
    public void brew() {
        System.out.println("Brewing an arabica lungo, " + this.amount);
    }
}
