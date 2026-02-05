package Arrays;                 // Package declaration – groups related classes together

import java.util.Scanner;        // Import Scanner class for user input

public class Array_3 {            

    public static void main(String[] args) {         // Main method – program execution starts here
        
        Scanner cs = new Scanner(System.in);         // Create Scanner object
        
        System.out.println("Enter the Size of String Array : ");
        int size = cs.nextInt();         // Read the size of the String array
        
        cs.nextLine();                     // Clear the input buffer after nextInt()
        String a[] = new String[size];         // Declare String array with user-defined size
        
        // Loop to read String elements from user
        for (int i = 0; i < a.length; i++) {
            System.out.print("String at [" + i + "] : ");
            a[i] = cs.nextLine();             // Store user input in String array
        }
        
        // Loop to display String array elements
        System.out.println("\nString Array elements are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("StringArray at [" + i + "] : " + a[i]);     // Print index and corresponding String value
        }
        
        cs.close();        // Close Scanner object
    }
}
