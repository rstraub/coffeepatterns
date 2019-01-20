package com.coffeepatterns.builder;

public class Espresso {
    void addBeans() {
        System.out.println("Adding freshly ground beans");
    }

    void addWater() {
        System.out.println("Adding water to be boiled");
    }

    void brew() {
        System.out.println("Boiling water");
        System.out.println("Forcing water through coffee");
        System.out.println("Collecting brew");
    }

    void drink() {
        System.out.println("Tasty...");
    }
}
