package com.java.practice.arrays.sort;

/**
 * Created by RaajiRanu on 9/24/17.
 */
public class InsertionSort {

    public void insertionSort(int[] intArray) {
        for (int i = 1; i < intArray.length; i++) {
            int key = intArray[i];
            int j = i-1;

            while (j >= 0 && intArray[j] >= key) {
                intArray[j+1] = intArray[j];
                j = j-1;
            }

            intArray[j+1] = key;
        }
    }
}
