package com.isp.lab2;

public class Exercise4 {

    public static int displayMax(int[] numbers) {
        int maxNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 10, 2, 20, 4};
        System.out.println(displayMax(numbers));
    }
}
