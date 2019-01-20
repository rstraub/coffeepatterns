package com.coffeepatterns.builder;

public class Barista {
    Espresso createEspresso() {
        EspressoBuilder builder = new EspressoBuilder();
        CoffeeDirector director = new CoffeeDirector(builder);
        director.construct();
        return builder.getResult();
    }

    FrenchPressedCoffee createFrenchPressedCoffee() {
        FrenchPressBuilder builder = new FrenchPressBuilder();
        CoffeeDirector director = new CoffeeDirector(builder);
        director.construct();
        return builder.getResult();
    }
}
