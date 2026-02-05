package Inheritance;

class My_Father{
	void Car()
	{
		System.out.println("*****Inside Parent Class*****");
		System.out.println("Dear Son --> Metallic Grey, Looks Good and Descent");
	}
}

class MySon extends My_Father{
	void MyCar()
	{
		System.out.println("*****Inside Child Class*****");
		System.out.println("Hi Dad --> I want a Swift CAR");
		System.out.println("What's your Color Option ? ");
	}
	
	void Car()
	{  
		System.out.println("*****Inside Child Class, But Parent Class Method Overrided *****");
		System.out.println("Dear Son --> Metallic Grey, Looks Good and Descent");
		System.out.println("No Dad --> Sizzling Red, Looks Sporty and Attractive");
	}

}
public class Method_Overriding {
	
	public static void main(String[] args) {
	MySon caller = new MySon();
	caller.MyCar();
	caller.Car();
}
}
