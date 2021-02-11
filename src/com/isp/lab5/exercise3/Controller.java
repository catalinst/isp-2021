package com.isp.lab5.exercise3;

public class Controller {
    private final TemperatureSensor temperatureSensor;
    private final LightSensor lightSensor;

    public Controller() {
        this.temperatureSensor = new TemperatureSensor("Bucharest");
        this.lightSensor = new LightSensor("London");
    }

    public void control() {

        for (int i = 0; i < 20; i++) {

            System.out.println("Temperature sensor read: " + temperatureSensor.readValue());
            System.out.println("Light sensor read: " + lightSensor.readValue());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
