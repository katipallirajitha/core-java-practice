package com.java.practice.controlstatements;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DayOfWeekTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 1-7: ");

        int dayNumber = 0;
        DayOfWeek dayOfWeek = new DayOfWeek();

        try {
            dayNumber = scanner.nextInt();
            dayOfWeek.printDayOfWeek(dayNumber);

        } catch (InputMismatchException ex) {
            System.out.println("The input you entered is not an integer. Please enter a number.");

        } catch (NoSuchElementException | IllegalStateException ex) {
            System.out.println("There has been an exception while reading the input.");
        }

        scanner.close();
    }

}
