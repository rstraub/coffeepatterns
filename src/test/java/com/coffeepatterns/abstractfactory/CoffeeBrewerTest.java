package com.coffeepatterns.abstractfactory;

import com.coffeepatterns.abstractfactory.factories.ArabicaFactory;
import com.coffeepatterns.abstractfactory.factories.RobustaFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CoffeeBrewerTest {
    @Test
    void testArabicaBrew() {
        CoffeeBrewer brewer = new CoffeeBrewer(new ArabicaFactory());

        var result = brewer.brewEspresso();

        assertTrue(result.contains("arabica"));
    }

    @Test
    void testRobustaBrew() {
        CoffeeBrewer brewer = new CoffeeBrewer(new RobustaFactory());

        var result = brewer.brewEspresso();

        assertTrue(result.contains("espresso"));
    }

    @Test
    void testEspressoBrew() {
        CoffeeBrewer brewer = new CoffeeBrewer(new RobustaFactory());

        var result = brewer.brewEspresso();

        assertTrue(result.contains("espresso"));
    }

    @Test
    void testLungoBrew() {
        CoffeeBrewer brewer = new CoffeeBrewer(new RobustaFactory());

        var result = brewer.brewLungo();

        assertTrue(result.contains("lungo"));
    }
}
