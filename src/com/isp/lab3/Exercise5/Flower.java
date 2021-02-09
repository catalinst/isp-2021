package com.isp.lab3.Exercise5;

public class Flower {
    public static int counter;

    Flower() {
        System.out.println("Flower has been created!");
        counter++;
    }

    public static int getNumberOfObjectsCreated() {
        return counter;
    }
}
