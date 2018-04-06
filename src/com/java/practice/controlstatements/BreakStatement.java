package com.java.practice.controlstatements;

/**
 * Created by RaajiRanu on 9/23/17.
 */
public class BreakStatement {

    public static void main(String[] args) {
        // unlabeled break example
        for (int i = 0; i < 11; i++) {
            System.out.println("Count: " + i);

            if (i >= 5) {
                break;
            }
        }

        // labeled break statement
        outer:
            for (int i = 0; i < 11; i++) {
                System.out.println("");
                inner:
                    for(int j = 0; j < 11; j++) {
                        System.out.print(j + " ");
                        if (j >= 5) {
                            break outer; //breaks outer loop
                        }
                    }
            }

        outerOne:
            for (int i = 10; i < 20; i++) {
                System.out.println("");
                innerOne:
                    for(int j = 10; j < 20; j++) {
                    System.out.print(j + " ");
                    if (j >= 15) {
                        break; // breaks innerOne
                    }
                }
            }
    }
}
