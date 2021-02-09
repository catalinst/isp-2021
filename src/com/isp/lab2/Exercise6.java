package com.isp.lab2;

public class Exercise6 {

    public static int recursive(int number) {
        if (number <= 1) {
            return 1;
        }
        else {
            return number * recursive(number - 1);
        }
    }

    public static int nonRecursive(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(recursive(4));
        System.out.println(nonRecursive(4));
    }
}
