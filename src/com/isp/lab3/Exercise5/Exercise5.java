package com.isp.lab3.Exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        Flower[] garden = new Flower[5];

        for (int i = 0; i < 5; i++) {
            Flower f = new Flower();
            garden[i] = f;
        }

        System.out.println(Flower.getNumberOfObjectsCreated());
    }
}
