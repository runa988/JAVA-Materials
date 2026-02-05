package Pkg2;          // Package declaration – Class_2 belongs to package Pkg2

import Pkg1.Class_1;        // Import Class_1 from package Pkg1

public class Class_2 {        

    public static void main(String[] args) {          // Main method – program execution starts here

        Class_1 obj1 = new Class_1();             // Create object of Class_1 (from another package)

        Class_2_1 obj2 = new Class_2_1();         // Create object of Class_2_1 (same package)

        obj1.display();                          // Call method of Class_1

        obj2.display();                          // Call method of Class_2_1

        System.out.println( "Both Class_1 and Class_2_1 are accessible from Class_2 in Package_2" );
        // Print final confirmation message
    }
}
