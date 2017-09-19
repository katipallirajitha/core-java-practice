package com.java.practice.strings;

public class PalindromicSequenceTester {
    
    public static void main(String[] args) {
        String sequenceOne = "madam";
        String sequenceTwo = "A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!";
        String sequenceThree = "Are we not pure? “No sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man; a prisoner up to new era.";
        String sequenceFour = "This is not a palindrome.";
        
        PalindromicSequence palindromicSequence = new PalindromicSequence();
        
        System.out.println("The String \"" + sequenceOne + "\" is a palindrome: " + palindromicSequence.isPalindrome(sequenceOne));
        System.out.println("The String \"" + sequenceTwo + "\" is a palindrome: " + palindromicSequence.isPalindrome(sequenceTwo));
        System.out.println("The String \"" + sequenceThree + "\" is a palindrome: " + palindromicSequence.isPalindrome(sequenceThree));
        System.out.println("The String \"" + sequenceFour + "\" is a palindrome: " + palindromicSequence.isPalindrome(sequenceFour));
    }
}
