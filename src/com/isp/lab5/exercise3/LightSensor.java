package com.isp.lab5.exercise3;

import java.util.Random;

public class LightSensor extends Sensor {

    public LightSensor(String location) {
        super(location);
    }

    @Override
    public int readValue() {
        return new Random().nextInt(99) + 1;
    }
}
