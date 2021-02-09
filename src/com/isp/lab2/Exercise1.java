package com.isp.lab2;

import java.util.Scanner;

public class Exercise1 {

    public static void displayMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The max is: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("The max is: " + secondNumber);
        } else {
            System.out.println("Numbers are equal");
        }

    }

    public static void main(String[] args) {
        displayMax();
    }


}
