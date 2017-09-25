package com.java.practice.arrays.search;

public class JumpSearchTester {
    public static void main(String[] args) {
        int[] intArray = {1, 3, 5, 7, 9, 11, 13, 15};
        
        int numberToBeFound = 15;
        
        JumpSearch jumpSearch = new JumpSearch();
        System.out.println(jumpSearch.jumpSearch(intArray, numberToBeFound));
    }
}
