package com.java.practice.controlstatements;

public class DayOfWeek {
    
    /* This method prints the name of the day by taking the number of the day as input from the user */
    public void printDayOfWeek(int dayNumber) {
        String dayOfWeek = null;

        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("The number should be between 1 & 7.");

        } else {
            switch (dayNumber) {
                case 1:
                    dayOfWeek = "Monday";
                    break;
                case 2:
                    dayOfWeek = "Tuesday";
                    break;
                case 3:
                    dayOfWeek = "Wednesday";
                    break;
                case 4:
                    dayOfWeek = "Thursday";
                    break;
                case 5:
                    dayOfWeek = "Friday";
                    break;
                case 6:
                    dayOfWeek = "Saturday";
                    break;
                case 7:
                    dayOfWeek = "Sunday";
                    break;
                default:
                    dayOfWeek = "Invalid Number Entered";
                    break;
            }

            System.out.println(dayOfWeek);
        }
    }
}
