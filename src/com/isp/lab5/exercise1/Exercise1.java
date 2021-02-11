package com.isp.lab5.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        shapes[0] = new Circle();
        shapes[1] = new Circle(5);
        shapes[2] = new Circle("blue", true, 10);
        shapes[3] = new Rectangle();
        shapes[4] = new Rectangle(5, 10);
        shapes[5] = new Rectangle("white", false, 8,8);
        shapes[6] = new Square();
        shapes[7] = new Square(9);
        shapes[8] = new Square("orange", true, 10);


        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
            System.out.println("----------");
        }
    }
}
