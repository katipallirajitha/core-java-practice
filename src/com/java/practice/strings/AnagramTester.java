package com.java.practice.strings;

/**
 * This class tests the isAnagram(String one, String two) method in Anagram class.
 */
public class AnagramTester {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();

        String subjectOne = "Creative";
        String anagramOne = "reactive";

        System.out.println("The string \"" + anagramOne + "\" is anagram of string \"" + subjectOne + "\": " +
                anagram.isAnagram(subjectOne, anagramOne));

        String subjectTwo = "The earthquakes";
        String anagramTwo = "The queer shakes";

        System.out.println("The string \"" + anagramTwo + "\" is anagram of string \"" + subjectTwo + "\": " +
                anagram.isAnagram(subjectTwo, anagramTwo));

        String subjectThree = "Mother-in-law";
        String anagramThree = "Hitler woman";

        System.out.println("The string \"" + anagramThree + "\" is anagram of string \"" + subjectThree + "\": " +
                anagram.isAnagram(subjectThree, anagramThree));

        String subjectFour = "subject";
        String anagramFour = "anagram";

        System.out.println("The string \"" + anagramFour + "\" is anagram of string \"" + subjectFour + "\": " +
                anagram.isAnagram(subjectFour, anagramFour));
    }
}
