package Inheritance;

class Grandfather {                   // Grandparent class

 public void method_1() {        // Method of Grandfather class
        System.out.println("I am GrandFather");
    }
}

class Father_1 extends Grandfather {     // Parent class inherits Grandfather

       public void method_2() {                  // Method of Father class
        System.out.println("I am Father able to access Grandfather classes");
    }
}

class Son_MultiLevel_Inheritance extends Father_1 {       // Child class inherits Father (Multilevel Inheritance)

    public void method_3() {                  				// Method of Grandson class
        System.out.println("I am Grandson able to access both Parent and Grandfather classes");
    }

    public static void main(String[] args) {      // Main method – program execution starts here

        Son_MultiLevel_Inheritance caller = new Son_MultiLevel_Inheritance();       // Create object of Grandson class
        caller.method_3();                   // Call method of Grandson class
        caller.method_2();					  // Call method of Father class (inherited)
        caller.method_1();					 // Call method of Grandfather class (inherited through Father)
    }
}
