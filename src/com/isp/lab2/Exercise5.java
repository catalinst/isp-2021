package com.isp.lab2;

import java.util.Arrays;
import java.util.Random;

public class Exercise5 {

    public static void generateVector() {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(40);
        }

        sortVector(numbers);
    }

    public static void sortVector(int[] vector) {
        int aux;

        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(vector));

    }


    public static void main(String[] args) {
        generateVector();
    }
}
