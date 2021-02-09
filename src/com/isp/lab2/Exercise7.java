package com.isp.lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {

    public static void guessNumber(int number) {
        int lives = 3;
        Scanner scanner = new Scanner(System.in);

        while (lives > 0) {
            System.out.println("Enter your number:");
            int inputNumber = scanner.nextInt();

            if (inputNumber > number) {
                System.out.println("Wrong answer, your number it too high");
                lives--;
            } else if (inputNumber < number) {
                System.out.println("Wrong answer, your number is too low");
                lives--;
            } else {
                System.out.println("You guessed it");
                System.exit(0);
            }
        }

        System.out.println("You lost");
    }

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(5) + 1;
        guessNumber(number);
    }
}
