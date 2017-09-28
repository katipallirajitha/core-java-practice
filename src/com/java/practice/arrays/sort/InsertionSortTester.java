package com.java.practice.arrays.sort;

/**
 * Created by RaajiRanu on 9/24/17.
 */
public class InsertionSortTester {

    public static void main(String[] args) {
        int[] intArray = {3, 8, 5, 2, 1};

        System.out.print("Unsorted Integer Array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(intArray);

        System.out.print("\nSorted Integer Array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
