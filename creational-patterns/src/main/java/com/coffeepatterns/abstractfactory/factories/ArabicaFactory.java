package com.coffeepatterns.abstractfactory.factories;

import com.coffeepatterns.abstractfactory.products.ArabicaEspresso;
import com.coffeepatterns.abstractfactory.products.ArabicaLungo;
import com.coffeepatterns.abstractfactory.products.Espresso;
import com.coffeepatterns.abstractfactory.products.Lungo;

public class ArabicaFactory extends CoffeeFactory {
    @Override
    public Espresso createEspresso() {
        return new ArabicaEspresso();
    }

    @Override
    public Lungo createLungo() {
        return new ArabicaLungo();
    }
}
