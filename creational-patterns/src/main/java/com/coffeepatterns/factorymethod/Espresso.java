package com.coffeepatterns.factorymethod;

public class Espresso extends Coffee {
    private String beanType;

    public Espresso(String beanType) {
        this.beanType = beanType;
    }

    public String toString() {
        return "Espresso made with " + beanType + " beans";
    }
}
