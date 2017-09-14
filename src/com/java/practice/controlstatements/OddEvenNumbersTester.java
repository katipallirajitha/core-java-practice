package com.java.practice.controlstatements;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class OddEvenNumbersTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        int number = 0;
        OddEvenNumbers oddEvenNumbers = new OddEvenNumbers();

        try {
            number = scanner.nextInt();
            oddEvenNumbers.printEvenOrOdd(number);

        } catch (InputMismatchException ex) {
            System.out.println("The input you entered is not an integer. Please enter a number.");

        } catch (NoSuchElementException | IllegalStateException ex) {
            System.out.println("There has been an exception while reading the input.");
        }

        scanner.close();
    }
}
