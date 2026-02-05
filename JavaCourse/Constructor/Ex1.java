package Constructor;
import java.util.Scanner;

public class Ex1{
	String sub_Name;
	int credit;
	
	Ex1(Scanner cs) // Constructor
	{
		System.out.println("Sub_Name = ");
		sub_Name = cs.nextLine();
		System.out.println("Sub_Credit =");
	    credit = cs.nextInt();
	}
	
	void display()
	{
		System.out.println("Sub_Name = " +sub_Name);
		System.out.println("Credit =" +credit);
	}
	
public static void main(String[] args)
{
	Scanner cs = new Scanner(System.in);
	Ex1 caller = new Ex1(cs);
	caller.display();
}
}
