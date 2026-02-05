package Class_Methods;
import java.util.Scanner;

public class MethodTypes {
	
public void add(Scanner cs)  //1. Method without arguments and without return value
{
	System.out.print("Enter the value_1 : ");
	int x = cs.nextInt();
	System.out.print("Enter the value_2 : ");
	int y = cs.nextInt();
	System.out.println("Sum of "+x+" +"+y+" = " + (x+y));
}

public void sub(int a, int b) // 2. Method with arguments and without return value
{
	System.out.println("Difference of "+a+" - "+b+" = " + (a-b));
}

public double div(Scanner cs) // 3. Method without arguments and with return value
{
	System.out.print("Enter the value_1 : ");
	int x = cs.nextInt();
	System.out.print("Enter the value_2 : ");
	int y = cs.nextInt();
	System.out.print("Division of "+x+" / "+y+"  " );
	return(x/y);
}

public int Modulo(int a, int b) // 4. Method with arguments and with return value
{
	return(a%b);
}

public static void main(String[] args)
{
	Scanner cs = new Scanner(System.in);
	MethodTypes caller = new MethodTypes();
	
	char repeat;
	
	do {
		System.out.println("Methods Types in Java");
		System.out.println("1. Method without arguments and without return value");
		System.out.println("2. Method with arguments and without return value");
		System.out.println("3. Method without arguments and with return value");
		System.out.println("4. Method with arguments and with return value");
		System.out.println("Enter your choice : ");
		int choice = cs.nextInt();
		
		
		switch(choice) {
		
		case 1, 3:
			if(choice ==1) {
				caller.add(cs);}
			else {
				double z = caller.div(cs);
				System.out.print(" = " + z);}
		break;
		
		case 2, 4:
			System.out.print("Enter the value_1 : ");
			int val_1 = cs.nextInt();
			System.out.print("Enter the value_2 : ");
			int val_2 = cs.nextInt();
			if (choice ==2) {
				caller.sub(val_1, val_2);}
			else {
				int k = caller.Modulo(val_1, val_2);
		        System.out.print("Modulo of "+val_1+" % "+val_2+" = " +k );}
		break;
		
		default:
		System.out.println("Invalid Input");
	}
	System.out.print("Do you want to continue ? (y or n):  ");
	repeat = cs.next().charAt(0);
	
	}while(repeat == 'y' || repeat == 'Y');
	
	cs.close();
}
}

		
	
	
		
	
	
	

