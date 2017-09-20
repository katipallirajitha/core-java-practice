package com.java.practice.strings;

/**
 * This class has a method to check if two strings are anagram of each other.
 */
public class Anagram {

    public boolean isAnagram(String subject, String anagram) {

        // Converting the first string to lower case and character array.
        char[] subjectCharArray = subject.toLowerCase().toCharArray();

        // Converting the second string to lowercase.
        String anagramLowerCase = anagram.toLowerCase();

        for (int i = 0; i < subjectCharArray.length; i++) {

            // Checking if the character is a letter.
            if (subjectCharArray[i] >= 'a' && subjectCharArray[i] <= 'z') {

                // Checking if the second string contains the character in this iteration.
                // If not, the function returns false.
                if (!anagramLowerCase.contains(String.valueOf(subjectCharArray[i]))) {
                    return false;
                }
            }
        }

        return true;
    }
}
