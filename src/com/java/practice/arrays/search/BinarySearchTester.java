package com.java.practice.arrays.search;

public class BinarySearchTester {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        
        int[] intArray = {0, 1, 2, 3, 4};
        
        System.out.println("index of element " + intArray[0] + " is: " + binarySearch.search(intArray, 1) );
        System.out.println("index of element " + intArray[0] + " is: " + binarySearch.recursiveBinarySearch(intArray, 0, intArray.length-1, 1));
    }

}
