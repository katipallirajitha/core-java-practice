package com.java.practice.arrays.sort;

/**
 * Created by RaajiRanu on 9/24/17.
 */
public class SelectionSort {

    // finds smaller element first and moves to the left end of the array
    // then works on the remaining elements
    public void selectionSort(int[] intArray) {
        for (int i = 0; i < intArray.length-1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] <= intArray[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            int temp = intArray[i];
            intArray[i] = intArray[minimumIndex];
            intArray[minimumIndex] = temp;
        }

    }
}
