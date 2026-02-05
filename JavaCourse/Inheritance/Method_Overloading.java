/*
What is Method Overloading?

Method overloading is a feature in Java where multiple methods have the same method name but different parameter lists, 
within the same class.

👉 It is an example of compile-time polymorphism.

Rules of Method Overloading
------------------------------------
Methods must differ by at least one of the following:

1. Number of parameters
2. Type of parameters
3. Order of parameters
❌ Changing only the return type is NOT allowed.
 */

package Inheritance;

public class Method_Overloading {

	void add()
	{
		int a=10;
		int b=20;
		System.out.println("Sum of "+a+" + "+b+" = " +(a+b));
	}

	void  add(int a, int b)
	{
		System.out.println("Sum of "+a+" + "+b+" = " +(a+b));
	}
	
	void add(String a, String b )
	{
		System.out.println("Concatenation of "+a+" & "+b+" = " +(a+b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading caller = new Method_Overloading();
		caller.add();
		caller.add(5, 9);
		caller.add("Arun","Kumar");
		}
}
