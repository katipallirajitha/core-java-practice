package com.java.practice.arrays.sort;

/**
 * Created by RaajiRanu on 9/24/17.
 */
public class SelectionSortTester {

    public static void main(String[] args) {
        int[] intArray = {11, 45, 64, 1, 6, 9, 10, 4, 3, 8};

        System.out.print("Unsorted Integer Array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        SelectionSort selectionSort = new SelectionSort();

        selectionSort.selectionSort(intArray);

        System.out.print("\nSorted Integer Array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
