package com.java.practice.strings;

public class PalindromicSequence {
    
    // Checks if a String (excluding the case, punctuations and spaces) is a palindrome.
    public boolean isPalindrome(String sequence) {
        
        // Converting the String to lower case and array of characters.
        char[] charSequence = sequence.toLowerCase().toCharArray();
        
        // First index variable starts at 0 and the second index variable starts at the last.
        int i = 0;
        int j = sequence.length() - 1;
        
        // The comparison should only be done until j is greater than i.
        while (j > i) {
            
            // Checking if the character at i index is a letter
            if (charSequence[i] >= 'a' && charSequence[i] <= 'z') {
                
                // Checking if the character at j index is a letter.
                if (charSequence[j] >= 'a' && charSequence[j] <= 'z') {
                    
                    // If characters at both i and j indices are letters, compare if they are same. If not, return false.
                    if (charSequence[i] != charSequence[j]) {
                        return false;
                    }
                    
                    // If characters at both i and j indices are same, increment i and decrement j.
                    i++;
                    j--;
                    
                } else {
                    // If the character at j index is not a letter decrement it.
                    j--;
                }
                
            } else {
                // If the character at i index is not a letter, increment it.
                i++;
            }
        }
        
        // Return true if the function was not returned before (This means the sequence is a palindrome).
        return true;
    }
}
