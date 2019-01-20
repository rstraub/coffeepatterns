package com.coffeepatterns.builder;

public class FrenchPressedCoffee {
    void addBeans() {
        System.out.println("Adding coarsely ground coffee");
    }

    void addWater() {
        System.out.println("Pouring boiled water over coffee");
    }

    void brew() {
        System.out.println("Pressing piston on coffee");
        System.out.println("Pouring drink");
    }

    void drink() {
        System.out.println("A little bitter...");
    }
}
