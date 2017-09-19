package com.java.practice.controlstatements;

/**
 * Created by RaajiRanu on 9/14/17.
 */
public class FactorialCalculator {

    /* Using Recursion */
    public int factorialUsingRecursion(int number) {
        int factorial;

        if (number == 1) {
            factorial = 1;

        } else {
           factorial = number * factorialUsingRecursion(number - 1);
        }

        return factorial;
    }

    /* Using while loop */
    public int factorialUsingLoop(int number) {

        int factorial = 1;

        while (number > 1) {
            factorial = factorial * number;
            number = number - 1;
        }

        return factorial;
    }
}
