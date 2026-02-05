package Pkg1;        // Package declaration – groups this class under Pkg1

public class Class2 {      // Class declaration

    private void display() {          // Private method – accessible only within this class
        System.out.println( "'display()' is private and accessible only within this 'Class2'." );
        // Message explains private access rule
    }

    public static void main(String[] args) {        // Main method – program execution starts here

        Class2 caller = new Class2();          // Create object of the same class
        caller.display();                      // Call private method within the same class
        System.out.println(  "'Private method' accessed successfully inside the same 'Class2'." );
        // Confirms that private access works inside the same class
        
        Class_1 obj = new Class_1();
        obj.print();      
        System.out.println(  "'Protected method' accessed successfully within the same package." 	);

    }
}
