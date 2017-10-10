package com.java.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class CircleTester {
    public static void main(String[] args) {
        // declaration and initialization of circles list
        List<Circle> circles = new ArrayList<Circle>();
        
        // declaration and initialization of radius
        double radius = Math.random();
        
        // adding circle objects to circles list until Math.random() returns value less than 0.01
        while(radius > 0.01) {
            Circle circle = new Circle(radius);
            circles.add(circle);
            radius = Math.random();
        }
        
        // Printing radius and area of each circle in the circles list
        for (Circle circle: circles) {
            System.out.println("Radius is: " + circle.getRadius() + ", Area is: " + circle.getArea());
        }
    }
}
