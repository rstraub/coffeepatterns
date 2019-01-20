package com.coffeepatterns.abstractfactory.factories;

import com.coffeepatterns.abstractfactory.products.Espresso;
import com.coffeepatterns.abstractfactory.products.Lungo;

public abstract class CoffeeFactory {
    public abstract Espresso createEspresso();

    public abstract Lungo createLungo();
}
