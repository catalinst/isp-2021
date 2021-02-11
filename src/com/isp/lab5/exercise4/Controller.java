package com.isp.lab5.exercise4;

public class Controller {
    private final TemperatureSensor temperatureSensor;
    private final LightSensor lightSensor;
    private static Controller controller = new Controller();

    private Controller() {
        this.temperatureSensor = new TemperatureSensor("Bucharest");
        this.lightSensor = new LightSensor("London");
    }

    public static Controller getInstance() {
        return controller;
    }

    public void control() {

        for (int i = 0; i < 20; i++) {

            System.out.println("Temperature sensor read: " + temperatureSensor.readValue());
            System.out.println("Light sensor read: " + lightSensor.readValue());
            System.out.println("----------");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
