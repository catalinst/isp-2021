package com.isp.lab3.Exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "blue");
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        System.out.println(circle);

        Circle circle1 = new Circle(10);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getRadius());
        System.out.println(circle1);
    }
}
