package com.isp.lab4.exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle);
        System.out.println(circle.getArea());

        System.out.println("-----------");

        Cylinder cylinder = new Cylinder(10, 10);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getArea());
    }
}
