package com.coffeepatterns.abstractfactory.products;

public class RobustaLungo extends Lungo {
    @Override
    public void brew() {
        System.out.println("Brewing a robusta lungo, " + this.amount);
    }
}
