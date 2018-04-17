package com.sda.factory.animalas.cat;

public class PersianCat implements Cat {
    @Override
    public void sleep() {
        System.out.println("Sleeping on a sofa");
    }

    @Override
    public void eat() {
        System.out.println("Eating beef");
    }
}
