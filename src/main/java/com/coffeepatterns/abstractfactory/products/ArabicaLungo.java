package com.coffeepatterns.abstractfactory.products;

public class ArabicaLungo extends Lungo {
    @Override
    public String brew() {
        return "Brewing an arabica lungo, " + this.getAmount();
    }
}
