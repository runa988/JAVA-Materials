package Class_Methods;                     // Package declaration

class Methods {               // Class declaration

    void display() {                 // Non-static method
        System.out.println("Now we are learning about Non Static method\n");
    }

    static void sum() {               // Static method
        int a = 10;                   // First number
        int b = 20;                   // Second number
        int c = a + b;                // Adding two numbers
        System.out.print("The sum of a + b: " + c);  // Display result
    }

    public static void main(String args[]) {   // Main method

        Methods caller = new Methods(); // Creating object for non-static method
        caller.display();               // Calling non-static method using object
        sum();                           // Calling static method without object
    }
}
