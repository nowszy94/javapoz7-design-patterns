package com.sda.factory.animalas;

import com.sda.factory.animalas.bird.Bird;
import com.sda.factory.animalas.bird.BirdFactory;
import com.sda.factory.animalas.bird.BirdType;
import com.sda.factory.animalas.cat.Cat;
import com.sda.factory.animalas.cat.CatFactory;
import com.sda.factory.animalas.dog.Dog;
import com.sda.factory.animalas.dog.DogFactory;

public class AnimalsFactory {
    private DogFactory dogFactory;
    private CatFactory catFactory;
    private BirdFactory birdFactory;

    public AnimalsFactory() {
        this.dogFactory = new DogFactory();
        this.catFactory = new CatFactory();
        this.birdFactory = new BirdFactory();
    }

    public AnimalsFactory(DogFactory dogFactory, CatFactory catFactory, BirdFactory birdFactory) {
        this.dogFactory = dogFactory;
        this.catFactory = catFactory;
        this.birdFactory = birdFactory;
    }

    public Dog createDog(String height) {
        return dogFactory.create(height);
    }

    public Cat createCat(String status) {
        return catFactory.createCat(status);
    }

    public Bird createBird(BirdType type) {
        return birdFactory.createBird(type);
    }
}
