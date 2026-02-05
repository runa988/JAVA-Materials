package Constructor;

public class Default_constructor {

	int a;
	
	public static void main(String[] args) {
	Default_constructor caller = new Default_constructor();
	System.out.println("The value of 'a' is "+caller.a);
	}
}
/*
This program demonstrates the default constructor in Java.
Since no constructor is written, the compiler automatically creates a default constructor.
The instance variable `a` is not initialized, so Java assigns it the default value 0.
When the object is created, the constructor runs and the value of `a` is printed as `0`.
*/