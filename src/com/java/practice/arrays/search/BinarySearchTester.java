package com.java.practice.arrays.search;

public class BinarySearchTester {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        
        int[] intArray = {0, 1, 2, 3, 4};
        
        System.out.print("Elements in array are: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        
        int numberToBeFound = 4;
        int numberToBeFoundTwo = 1;
        
        System.out.println("\n\nThe number " + numberToBeFound + " is found at index: " + binarySearch.search(intArray, numberToBeFound));
        System.out.println("\nRecursive Binary Search:");
        System.out.println("The number " + numberToBeFoundTwo + " is found at index: " + binarySearch.search(intArray, numberToBeFoundTwo));
        
    }

}
