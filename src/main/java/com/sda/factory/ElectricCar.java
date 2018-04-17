package com.sda.factory;

public class ElectricCar implements Car {

    private ElectricMotor electricMotor;
    private ElectricSystem electricSystem;

    public ElectricCar(ElectricMotor electricMotor, ElectricSystem electricSystem) {
        this.electricMotor = electricMotor;
        this.electricSystem = electricSystem;
    }

    @Override
    public void drive() {
        System.out.println("Driving using electricity");
    }
}
