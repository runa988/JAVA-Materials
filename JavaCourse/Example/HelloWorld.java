package Example;        // Package name – used to group related classes

public class HelloWorld {        // Class declaration – file name must be HelloWorld.java

    public static void main(String[] args) {           // main method – program execution starts here

        System.out.print("Hello,");          // Prints "Hello," on the screen (cursor stays on the same line)

        System.out.print("World !\n");      // Prints "World !" on the same line

        System.out.println("Hello, World !");   // Prints "Hello, World !" and moves the cursor to the next line
    }
}

/*
📌 Rule:
If a class is declared as public,
the file name must be exactly the same as the class name.
*/
/*
public: An access modifier, meaning the method can be accessed from anywhere, 
allowing the JVM to find and run it from outside the class. 

static: A keyword that makes the method belong to the class itself, not an instance (object) of the class, 
so the JVM can call it without creating an object. 

void: Indicates that the main method does not return any value after it finishes executing. 

main: The specific name the JVM searches for as the starting point of the program.

(String[] args): A parameter that accepts an array of String objects, allowing you to pass arguments 
to the program from the command line when you run it (e.g., java MyProgram arg1 arg2).
 */