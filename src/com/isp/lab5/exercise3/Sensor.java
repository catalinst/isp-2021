package com.isp.lab5.exercise3;

public abstract class Sensor {
    private String location;

    public Sensor(String location) {
        this.location = location;
    }

    public abstract int readValue();

    public String getLocation() {
        return location;
    }
}
