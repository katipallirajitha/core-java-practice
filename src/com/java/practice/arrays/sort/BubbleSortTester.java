package com.java.practice.arrays.sort;

/**
 * Created by RaajiRanu on 9/24/17.
 */
public class BubbleSortTester {
    public static void main(String[] args) {
        int[] intArray = {3, 8, 5, 2, 1};

        System.out.print("Unsorted Integer Array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(intArray);

        System.out.print("\nSorted Integer Array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        int[] intArrayTwo = {10, 9, 8, 7, 6, 5};

        System.out.print("\nUnsorted Integer Array: ");
        for (int i = 0; i < intArrayTwo.length; i++) {
            System.out.print(intArrayTwo[i] + " ");
        }

        bubbleSort.recursiveBubbleSort(intArrayTwo, intArrayTwo.length);

        System.out.print("\nSorted Integer Array: ");
        for (int i = 0; i < intArrayTwo.length; i++) {
            System.out.print(intArrayTwo[i] + " ");
        }

    }
}
