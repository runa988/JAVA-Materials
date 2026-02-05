package ControlStatements;

import java.util.Scanner;

public class Loop_do_while {

    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);     // Create Scanner object

        System.out.print("Enter the array size : ");
        int size = cs.nextInt();      // Read array size

        int a[] = new int[size];    // Declare array with given size

        System.out.println("Enter the array elements");

        int i = 0;
        // Loop control variable
        // do-while loop executes at least once
        do {
            System.out.print("Array Element [" + i + "] : ");
            a[i] = cs.nextInt();
            // Store input in array
            i++;
        } while (a.length>i);    // Condition is checked after execution

        // Reset index to print array elements
        i = 0;

        System.out.println("\nArray elements are:");
        do {
            System.out.println("Array Element [" + i + "] : " + a[i]);
            i++;
        } while (i < a.length);   // Print all array elements

        cs.close();         // Close Scanner
    }
}

