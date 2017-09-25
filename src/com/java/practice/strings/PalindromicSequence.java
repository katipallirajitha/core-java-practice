package com.java.practice.strings;

public class PalindromicSequence {
    
    // Checks if a String (excluding the case, punctuations and spaces) is a palindrome.
    public boolean isPalindrome(String sequence) {

        sequence = sequence.replaceAll("[^a-zA-Z]", "");

        // Converting the String to lower case and array of characters.
        char[] charSequence = sequence.toLowerCase().toCharArray();

        
        // First index variable starts at 0 and the second index variable starts at the last.
        int i = 0;
        int j = sequence.length() - 1;
        
        // The comparison should only be done until j is greater than i.
        while (j > i) {
                    
            // compare if characters at i and j indices are same. If not, return false.
            if (charSequence[i] != charSequence[j]) {
                return false;
            }

            // If characters at both i and j indices are same, increment i and decrement j.
            i++;
            j--;
                    
        }

        // Return true if the function was not returned before (This means the sequence is a palindrome).
        return true;
    }
}
