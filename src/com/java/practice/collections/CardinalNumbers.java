package com.java.practice.collections;

public enum CardinalNumbers {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);
    
    private Integer number;
    
    private CardinalNumbers(int number) {
        this.number= number;
    }
    
    public Integer getNumber() {
        return number;
    }
}
