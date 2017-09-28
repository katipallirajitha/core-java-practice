package com.java.practice.arrays.sort;

/**
 * Created by RaajiRanu on 9/24/17.
 */
public class BubbleSort {

    public void bubbleSort(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            // after ith iteration, i number of elements are already sorted at the right end of the array
            // So, if i = 1, j should be less than 3 (5(length) - 1(i) - 1), until 2
            for (int j = 0; j < intArray.length-i-1; j++) {
                if (intArray[j] > intArray[j+1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
    }

    public void recursiveBubbleSort(int[] intArray, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n-1; i++) {
            if (intArray[i] > intArray[i+1]) {
                int temp = intArray[i];
                intArray[i] = intArray[i+1];
                intArray[i+1] = temp;
            }
        }

        recursiveBubbleSort(intArray, n-1);
    }
}
