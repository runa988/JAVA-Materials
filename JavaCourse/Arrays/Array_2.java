package Arrays;        // Package declaration – groups related classes

import java.util.Scanner;    // Import Scanner class for user input

public class Array_2 {       // Class declaration

    // Non-static method to calculate the sum of array elements
    // a[] → array passed from main method
    // n   → size of the array
    public void Array_sum(int a[], int n) {
        
        int sum = 0;         // Variable to store sum of array elements
        
        for (int j = 0; j < n; j++) {     // Loop runs from index 0 to (n - 1)
            sum += a[j];                      // Add each array element to sum
        }
        
        System.out.println("The Array sum is : " + sum);    // Print the sum of array elements
    }

    public static void main(String[] args) {    // Main method – program execution starts here
        
        Array_2 caller = new Array_2();         // Create object to call non-static method
        
        Scanner cs = new Scanner(System.in);   // Create Scanner object for user input
        
        System.out.print("Enter the size of Array : ");
        int size = cs.nextInt();             // Read array size from user
        
        int a[] = new int[size];           // Create array with user-defined size
        
        // Loop to read array elements from the user
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the Array element [" + i + "] : ");
            a[i] = cs.nextInt();               // Store input value in array
        }
        
        // Loop to display array elements
        System.out.println("\nArray elements are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array element [" + i + "] : " + a[i]);      // Display each array element with index
        }
        
        caller.Array_sum(a, size);           // Call method to calculate and print sum
        
        cs.close();         // Close Scanner object
    }
}
