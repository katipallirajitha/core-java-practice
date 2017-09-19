package com.java.practice.controlstatements;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by RaajiRanu on 9/14/17.
 */
public class FactorialCalculatorTester {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number >= 1: ");

        int number;
        int factorialUsingRecursion;
        int factorialUsingWhileLoop;

        FactorialCalculator factorialCalculator = new FactorialCalculator();

        try {
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("The number you entered is < 1. Please enter a number >= 1");

            } else {
                factorialUsingRecursion = factorialCalculator.factorialUsingRecursion(number);
                factorialUsingWhileLoop = factorialCalculator.factorialUsingLoop(number);

                System.out.println("The factorial (Using Recursion) of the number " + number + " is: " + factorialUsingRecursion);
                System.out.println("The factorial (Using while loop) of the number " + number + " is: " + factorialUsingWhileLoop);
            }

        } catch (InputMismatchException ex) {
            System.out.println("The input you entered is not a number. Please enter a number. " + ex);

        } catch (NoSuchElementException | IllegalStateException ex) {
            System.out.println("There has been exception while reading the input." + ex);
        }

        scanner.close();
    }
}
