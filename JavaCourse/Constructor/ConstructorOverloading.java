package Constructor;

public class ConstructorOverloading {
	
	ConstructorOverloading(int a)
	{
		System.out.print("The Integer value of 'a' = ");
		System.out.println(a);
	}
	ConstructorOverloading(String a)
	{
		System.out.print("The String value of 'a' = ");
		System.out.println(a);
	}
	ConstructorOverloading(float a)
	{
		System.out.print("The float value of 'a' = ");
		System.out.println(a);
	}
	public static void main(String[] args) {
		ConstructorOverloading caller1 = new ConstructorOverloading(2);
		ConstructorOverloading caller2 = new ConstructorOverloading(2.0236f);
		ConstructorOverloading caller3 = new ConstructorOverloading("Arunkumar");
	}
}
/*This program demonstrates constructor overloading in Java.
The class contains multiple constructors with the same name but different parameter types.
Based on the argument passed during object creation, the matching constructor is called.
This allows initializing objects in different ways using the same class.
*/