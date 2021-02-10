package com.isp.lab4.exercise6;

public class Square extends Rectangle {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        //super.setLength(side); // sau asa
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}' + " which is a subclass of " + super.toString();
    }
}
