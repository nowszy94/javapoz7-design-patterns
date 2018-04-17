package com.sda.factory.animalas;

import com.sda.factory.animalas.cat.Cat;
import com.sda.factory.animalas.cat.CatFactory;

public class CatTest {
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        Cat poor = catFactory.createCat("poor");
        poor.eat();
        poor.sleep();

        Cat rich = catFactory.createCat("rich");
        rich.eat();
        rich.sleep();
    }
}
