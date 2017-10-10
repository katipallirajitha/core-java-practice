package com.java.practice.collections;

import java.util.HashMap;
import java.util.Map;

public class CardinalNumbersTester {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<Integer, String>();
        
        for (CardinalNumbers number: CardinalNumbers.values()) {
            numbers.put(number.getNumber(), number.toString()); // Enum.toString() returns the name of this enum constant
        }
        
        for (Integer number: numbers.keySet()) {
            System.out.println("Number: " + number + ", English Word: " + numbers.get(number));
        }
    }
}
