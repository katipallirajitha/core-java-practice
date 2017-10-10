package com.java.practice.collections;

/**
 * @author Rajitha Katipalli
 * 
 * This is class for Circle.
 */
public class Circle {
    private double radius;
    
    /**
     * Parameterized Constructor for Circle class.
     * 
     * @param radius Radius of the circle object
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    
    /**
     * This method returns the radius of the Circle object.
     * 
     * @return radius of the circle object
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * This method calculates and returns the area of a circle object.
     * 
     * @return area of the circle object
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
