package Inheritance;

class MyFather{
	public void Car() {
	System.out.println("My Car has 4 - wheels");
	}
}

class Son extends MyFather{
	public void Bike()	{
	System.out.println("My Bike has 2 - wheels");	
	}
}

class Grandson extends MyFather{
	public void Tricycle() {
		System.out.println("My Tricycle has 3 - wheels");	
		} 
}
public class Hierarchical_Inheritance {
		
	public static void main(String[] args) {
	
	Son vehicle1 = new Son();
	System.out.println("Son Inherits --> MyFather Class Method -->Car() ");
	vehicle1.Car();
	System.out.println("Son able to Access his own Method -->Bike() ");
	vehicle1.Bike();
	System.out.println("******************************************");
	Grandson vehicle2 = new Grandson();
	System.out.println("Grandson Inherits --> MyFather Class Method -->Car() ");
	vehicle2.Car();
	System.out.println("Grandson able to Access his own Method -->Tricycle() ");
	vehicle2.Tricycle();
		}
}
