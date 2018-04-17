package com.sda.factory.animalas;

import com.sda.factory.animalas.dog.Dog;
import com.sda.factory.animalas.dog.DogFactory;

public class DogTest {
    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();

        Dog small = dogFactory.create("small");
        small.fetch();

        Dog big = dogFactory.create("big");
        big.fetch();
    }
}
