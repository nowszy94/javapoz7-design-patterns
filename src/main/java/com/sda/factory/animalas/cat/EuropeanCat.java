package com.sda.factory.animalas.cat;

public class EuropeanCat implements Cat {
    @Override
    public void sleep() {
        System.out.println("Sleeping on roof");
    }

    @Override
    public void eat() {
        System.out.println("Eating mouse");
    }
}
