package com.java.practice.arrays.search;

public class BinarySearch {
    
    // using while loop
    public int search(int[] sortedIntArray, int number) {
        
        // the search should start with the whole array first.        
        int leftIndex = 0;
        int rightIndex = sortedIntArray.length - 1;
                
        
        while (rightIndex >= leftIndex) {
            
            // calculating the middle index
            int middleIndex = leftIndex + (rightIndex - leftIndex)/2;
            
            // if the number to be searched is at middle index
            if (number == sortedIntArray[middleIndex]) {
                return middleIndex;
                
            } 
            
            // number is in the left half of the array
            if (number < sortedIntArray[middleIndex]) {
                rightIndex = middleIndex - 1;
                
            } else { // number is in the right half of the array
                leftIndex = middleIndex + 1;
            }
            
        }
        
        // If the number is not found in the array
        return -1;
    }
    
    // using recursion
    public int recursiveBinarySearch(int[] sortedIntArray, int leftIndex, int rightIndex, int number) {
        
        if (rightIndex >= 1) {
            
            // calculating the middle index
            int middleIndex = leftIndex + (rightIndex - leftIndex)/2;
            
            // if the number to be searched is at middle index
            if (number == sortedIntArray[middleIndex]) {
                return middleIndex;
            }
            
            // if number is less than the number at middle index, the left half of the array should be searched next
            if (number < sortedIntArray[middleIndex]) {
                return recursiveBinarySearch(sortedIntArray, leftIndex, middleIndex-1, number);
                
            } else { // if number is greater than number at middle index, the right half of the array should be searched next
                return recursiveBinarySearch(sortedIntArray, middleIndex + 1, rightIndex, number);
            }
        }
        
        // If no element in the array matches with the number to be searched
        return -1;       
    }
}
