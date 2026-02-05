package Constructor;

public class Constructor_WithArg {
	
	Constructor_WithArg(int a){
		System.out.print("The value of 'a' = ");
		System.out.println(a);
	}
	
public static void main(String[] args) {
	Constructor_WithArg caller = new Constructor_WithArg(2);
}
}

/*
This program demonstrates a constructor with arguments (parameterized constructor).
The constructor accepts an integer value and prints it when the object is created.
When new Constructor_WithArg(2) is executed, the value 2 is passed to the constructor.
The constructor is called automatically and displays the value of a.
*/