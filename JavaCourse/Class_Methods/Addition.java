package Class_Methods;                 // Package name (used to group related classes)

public class Addition {          // Class declaration

    void add() {                 // Non-static method to perform addition
        
        int a = 12;              // Declare and initialize first number 'a'
        int b = 10;              // Declare and initialize second number 'b'
        
        int c = a + b;           // Add two numbers
   
        System.out.println("Sum of a + b is : " + c);  // Print the result
    }

    public static void main(String[] args) {  // Main method (program starts here <--)
        
        Addition caller = new Addition();     // Create object of Addition class
        
        caller.add();                         // Call non-static add() method
    }
}

