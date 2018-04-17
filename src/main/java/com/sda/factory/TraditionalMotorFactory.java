package com.sda.factory;

import java.util.HashMap;
import java.util.Map;

public class TraditionalMotorFactory {

    private Map<String, TraditionalMotor> motorsInOffer;

    public TraditionalMotorFactory() {
        this.motorsInOffer = new HashMap<>();
        motorsInOffer.put("abc 3.0", new TraditionalMotor("abc", "3.0", "300", "10"));
        motorsInOffer.put("abc 2.0", new TraditionalMotor("abc", "2.0", "1800", "7"));
    }

    public TraditionalMotor createTraditionalMotor(String type) {
        return motorsInOffer.get(type);
    }


}
