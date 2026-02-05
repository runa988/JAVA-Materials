/* A method is a block of code that performs a specific task and runs only when it is called.
  
  Static Methods
	1.Declared using the keyword static
	2.Belong to the class
	3.Can be called without creating an object
 
 */

package Class_Methods;                     // Package declaration

public class static_Methods {          // Class name (PascalCase recommended)

    static void display() {           // Static method
        System.out.println("Hi Arun, How are you?");
        System.out.println("Hope you understood - Static Methods");
    }

    public static void main(String[] args) {  // Main method
        display();                    // Calling static method without object
    }
}
