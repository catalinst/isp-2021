package com.isp.lab2;

import java.util.Arrays;

public class Exercise3 {

    public static void displayPrimeNumbers(int a, int b) {
        int[] aux = new int[b-a+1];
        int counter = 0;

        for (int i = a; i <= b; i++) {
            if (checkIfItsPrime(i)) {
                aux[counter] = i;
                counter++;
            }
        }

        int[] primeNumbers = Arrays.copyOfRange(aux, 0, counter);
        System.out.println("We discovered: " + counter + " primes number: " + Arrays.toString(primeNumbers));


    }

    public static boolean checkIfItsPrime(int number) {
        if (number == 2) return true;

        if (number <= 1 || number % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        displayPrimeNumbers(2, 15);
    }
}
