package com.java.practice.arrays.search;

public class LinearSearch {
    
    // Linear Search - staring from the element at 0 index
    public int getElementIndex(int[] array, int element) {
        
        for(int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;           
            }
        }
        
        return -1;
    }
}
