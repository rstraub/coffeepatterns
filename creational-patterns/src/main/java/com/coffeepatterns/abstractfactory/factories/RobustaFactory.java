package com.coffeepatterns.abstractfactory.factories;

import com.coffeepatterns.abstractfactory.products.Espresso;
import com.coffeepatterns.abstractfactory.products.Lungo;
import com.coffeepatterns.abstractfactory.products.RobustaEspresso;
import com.coffeepatterns.abstractfactory.products.RobustaLungo;

public class RobustaFactory extends CoffeeFactory {
    @Override
    public Espresso createEspresso() {
        return new RobustaEspresso();
    }

    @Override
    public Lungo createLungo() {
        return new RobustaLungo();
    }
}
