package com.java.practice.arrays;

public class FindElementInArray {
    
    public int getElementIndex(int[] array, int element) {
        
        int index = -1;
        
        for(int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }
        
        return index;
    }
}
