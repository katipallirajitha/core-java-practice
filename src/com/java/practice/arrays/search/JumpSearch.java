package com.java.practice.arrays.search;

public class JumpSearch {
    
    public int jumpSearch(int[] sortedIntArray, int number) {
        
        int stepLength = (int) Math.sqrt(sortedIntArray.length);
        
        int left = 0;
        int right = 0;
                
        while (left < sortedIntArray.length) {
            
            right = Math.min(sortedIntArray.length-1, left + stepLength);
            
            if (sortedIntArray[left] == number) {
                return left;
                
            } else if (sortedIntArray[right] == number) {
                return right;
                
            } else if (sortedIntArray[left] > number) {
                return -1;
            }
                                                           
            if (sortedIntArray[left] < number && number < sortedIntArray[right]) {
                break;
            }
            
            left = left + stepLength;

        }
        
        for (int i = left; i < right; i++) {
            if (sortedIntArray[i] == number) {
                return i;
            }
        }
        
        return -1;
    }
}
