package com.sda.factory;

import java.util.HashMap;
import java.util.Map;

public class Dealer {

    private TraditionalMotorFactory bmwTraditionalMotorFactory;

    private SystemFactory bmwSystemFactory;

    public Dealer() {
        this.bmwTraditionalMotorFactory = new TraditionalMotorFactory();
        this.bmwSystemFactory = new SystemFactory();
    }

    public void main(String[] args) {
        Map<String, Car> map = new HashMap<>();
        map.put("Bmw x5", new TraditionalCar(bmwTraditionalMotorFactory.createTraditionalMotor("abc 3.0"), bmwSystemFactory.createTraditionalSystem("123")));
        map.put("Bmw x3", new TraditionalCar(new TraditionalMotor("Asdfa", "ddf", "3fsdf", "asdfasd"), new TraditionalSystem("asdfasd", "dfd", "fdf", "asdfasd")));
    }
}
