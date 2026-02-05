package Example;               // Package name

import java.util.Scanner;      // Import Scanner class for user input

public class get_val_runtime {   // Class declaration
    
	public static void main(String[] args) {   // Main method (program execution starts here)

        int a, b, c;           // Declare integer variables
        Scanner console = new Scanner(System.in); // Create Scanner object to read input from keyboard
        System.out.print("Enter value for a: ");  // Ask user to enter first number called 'a'
        a = console.nextInt();                   // Read 'a' value
        System.out.print("Enter value for b: "); // Ask user to enter second number called 'b'
        b = console.nextInt();                   // Read 'b' value
        c = a + b;                               // Add 'a' & 'b' and store in 'c'
        System.out.println("Sum of a + b is: " + c); // Display the result which stored in 'c'

        console.close();                         // Close the Scanner object
    }
}

