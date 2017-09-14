package com.java.practice.controlstatements;

public class OddEvenNumbers {

    /* This method takes an integer as an argument and prints if it is even or odd. */
    public void printEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is an even number.");
        } else {
            System.out.println("The number " + number + " is an odd number.");
        }
    }
}
