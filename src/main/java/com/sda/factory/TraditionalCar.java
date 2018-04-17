package com.sda.factory;

public class TraditionalCar implements Car {

    private TraditionalMotor traditionalMotor;
    private TraditionalSystem traditionalSystem ;

    public TraditionalCar(TraditionalMotor traditionalMotor, TraditionalSystem traditionalSystem) {
        this.traditionalMotor = traditionalMotor;
        this.traditionalSystem = traditionalSystem;
    }

    @Override
    public void drive() {
        System.out.println("Driving using petrol");
    }
}
