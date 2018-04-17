package com.sda.factory.animalas;

import com.sda.factory.animalas.bird.Bird;
import com.sda.factory.animalas.bird.BirdType;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AnimalsFactory animalsFactory = new AnimalsFactory();
        Bird bird = animalsFactory.createBird(BirdType.EAGLE);
        bird.fly();
    }
}
