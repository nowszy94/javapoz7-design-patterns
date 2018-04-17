package com.sda.factory;

public class MotorFactory {
    private ElectricMotorFactory electricMotorFactory;
    private TraditionalMotorFactory traditionalMotorFactory;

    public MotorFactory(ElectricMotorFactory electricMotorFactory, TraditionalMotorFactory traditionalMotorFactory) {
        this.electricMotorFactory = electricMotorFactory;
        this.traditionalMotorFactory = traditionalMotorFactory;
    }

    public ElectricMotor createElectricMotor(String name) {
//        return electricMotorFactory.createMotor(name);
        return null;
    }

    public TraditionalMotor createTraditionalMotor(String name) {
        return traditionalMotorFactory.createTraditionalMotor(name);
    }
}
