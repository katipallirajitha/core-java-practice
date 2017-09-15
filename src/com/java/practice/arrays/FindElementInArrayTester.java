package com.java.practice.arrays;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FindElementInArrayTester {
    
    public static void main(String[] args) {
        
        int[] intArray = new int[5];
        intArray[0] = 3;
        intArray[1] = 6;
        intArray[2] = 1;
        intArray[3] = 8;
        intArray[4] = 7;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number to get index in the array: ");
        
        FindElementInArray findElementInArray = new FindElementInArray();
        int element = 0;
        int indexOfElement = -1;
        
        try {
            element = scanner.nextInt();
            indexOfElement = findElementInArray.getElementIndex(intArray, element);
            
            if (indexOfElement >= 0) {
                System.out.println("The number " + element + " is found at the index: " + indexOfElement);
                
            } else {
                System.out.println("The number " + element + " does not exist in the array.");
            }
            
        } catch (InputMismatchException ex) {
            System.out.println("The input you entered is not a number. Please enter a number.");
            
        } catch (NoSuchElementException | IllegalStateException ex) {
            System.out.println("There has been an exception while reading the input. Please try again");          
        }
        
        scanner.close();
    }
}
