package com.isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle("blue", false, 10);
        System.out.println(circle1);

        Rectangle rectangle = new Rectangle("yellow", true, 2.3, 5.7);
        System.out.println(rectangle);

        Square square = new Square(5);
        System.out.println(square);
    }
}
