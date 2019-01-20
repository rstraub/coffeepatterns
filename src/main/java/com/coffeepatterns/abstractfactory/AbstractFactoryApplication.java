package com.coffeepatterns.abstractfactory;

import com.coffeepatterns.abstractfactory.factories.ArabicaFactory;
import com.coffeepatterns.abstractfactory.factories.RobustaFactory;

public class AbstractFactoryApplication {
    public static void main(String[] args) {
        System.out.println("Ready to brew\n---------------");

        CoffeeBrewer brewer = new CoffeeBrewer(new ArabicaFactory());
        brewer.brewEspresso();
        brewer.setCoffeeFactory(new RobustaFactory());
        brewer.brewEspresso();
    }
}
