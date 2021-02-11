package com.isp.lab5.exercise4;

import java.util.Random;

public class TemperatureSensor extends Sensor {

    public TemperatureSensor(String location) {
        super(location);
    }

    @Override
    public int readValue() {
        return new Random().nextInt(99) + 1;
    }
}
