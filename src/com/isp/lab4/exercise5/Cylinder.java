package com.isp.lab4.exercise5;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super();
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
