package com.java.practice.arrays.search;

public class JumpSearchTester {
    public static void main(String[] args) {
        int[] intArray = {1, 3, 5, 7, 9, 11, 13, 15};
        
        System.out.print("Elements in Array are: ");
        for (int i = 0; i< intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        
        int numberToBeFound = 15;
        
        JumpSearch jumpSearch = new JumpSearch();
        System.out.print("\nNumber " + numberToBeFound + " is found at the index: " + jumpSearch.jumpSearch(intArray, numberToBeFound));
    }
}
