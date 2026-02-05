package Class_Methods;        // Package declaration – groups related classes together

import java.util.Scanner;         // Import Scanner class to take input from the user

public class Method_user_var {          // Class declaration

     void Addition(Scanner cs) {   // Non-static method without parameters
        int a, b, c;          // Declaring three  integer variables called 'a', 'b', and 'c'
        
        System.out.print("Enter the value for a : ");
        a = cs.nextInt();                      // Read 'a' value from user
        
        System.out.print("Enter the value for b : ");
        b = cs.nextInt();                   // Read 'b' value  from user
        c = a + b;                             // Perform addition and store the result in 'c'
        System.out.print("Result of a + b is : " + c);         // Display the addition result
        
    }
    
    // Non-static method with parameters
    // Receives values from main() and performs subtraction
    void Subtraction(int x, int y) {
        
    	int z = x - y;                         // Subtract y from x
        System.out.print("\nResult of a - b is : " + z);         // Display subtraction result
    }

    // Method with return type String
    // Returns the received String value
    String print(String k) {
        return k;                        // Return the String back to caller
    }

    public static void main(String[] args) {           // Main method – program execution starts here
        
        Method_user_var caller = new Method_user_var();         // Create object to call non-static methods
        Scanner cs = new Scanner(System.in);         // Create Scanner object for input in main method
        caller.Addition(cs);                     // Call method without parameters
   
        System.out.print("\nEnter the value for x : ");
        int x = cs.nextInt();                  // Read value for x
        System.out.print("Enter the value for y : ");
        int y = cs.nextInt();                  // Read value for y
        caller.Subtraction(x, y);              // Calls Subtraction() method by passing 'x' and 'y' as arguments
        
        cs.nextLine();                        // Clear input buffer before reading String input
        System.out.print("\nEnter your name : ");
        String k = cs.nextLine();             // Read String input from user
        String name = caller.print(k);         // Call method that returns String
        System.out.print("Thank you for your code : " + name);        // Display final message
        cs.close();                           // Close Scanner object
        
    }
}
