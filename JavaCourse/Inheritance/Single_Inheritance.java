// Single Inheritance 
package Inheritance;

class Father{     // Parent (Base) class
	public void father_name()    // Method of Father class
	{
	System.out.println("Inside Parent Class");	
	System.out.println("Father Name --> Arunkumar. R");	
    }
}

//Child (Derived) class, //Child inherits properties and methods of Father
class Son_Single_Inheritance extends Father {    
	public void child_name() // Method of Child class
	{
		System.out.println("Inside Child Class");	
		System.out.println("Child Name --> A.Rogan");	
	}
	
	public static void main(String[] args)
	{
		Son_Single_Inheritance caller = new Son_Single_Inheritance();    // Create object of Child class
		caller.child_name();			  // Call Child class method
		caller.father_name();			 // Call Parent class method using Child object
	}
}
	
	
	


