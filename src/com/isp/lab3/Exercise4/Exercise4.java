package com.isp.lab3.Exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        MyPoint point = new MyPoint();
        System.out.println(point);
        MyPoint point1 = new MyPoint(2, 4);
        System.out.println(point1);
        point.setXY(10, 10);

        System.out.println(point.distance(5,5));
        System.out.println(point.distance(point1));

    }

}
