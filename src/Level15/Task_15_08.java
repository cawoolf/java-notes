/*  OOP: Method overloading - Eliminating the superfluous: Completed!!

1. Think about which implementation of the print method will be called.
2. Remove any superfluous implementations of the print method.

Requirements:
•	Other than the main method, the Solution class should only have a single print method (with the correct parameter!).
•	The print method must be public.
•	The print method must be static.
•	The program should display "I will be a Java programmer!".
 */
package Level15;

/**
 *
 * @author Cam
 */
public class Task_15_08 {
 public static void main(String[] args) {
        print(1);
    }

   /* public static void print(byte b) {
        System.out.println("I will be a Java programmer!");
    }

    public static void print(double d) {
        System.out.println("I will be a Java programmer!");
    } */

    public static void print(long l) {
        System.out.println("I will be a Java programmer!");
    }
    /*
    public static void print(float f) {
        System.out.println("I will be a Java programmer!");
    }

    public static void print(char c) {
        System.out.println("I will be a Java programmer!");
    } */
}


