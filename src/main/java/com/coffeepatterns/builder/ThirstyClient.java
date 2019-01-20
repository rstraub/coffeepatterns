package com.coffeepatterns.builder;

public class ThirstyClient {
    public static void main(String[] args) {
        Barista barista = new Barista();

        barista.createEspresso().drink();

        barista.createFrenchPressedCoffee().drink();
    }
}
