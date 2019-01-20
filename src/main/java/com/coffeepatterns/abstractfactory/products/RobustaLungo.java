package com.coffeepatterns.abstractfactory.products;

public class RobustaLungo extends Lungo {
    @Override
    public String brew() {
        return "Brewing a robusta lungo, " + this.getAmount();
    }
}
