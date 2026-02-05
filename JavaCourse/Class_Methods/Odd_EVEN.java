package Class_Methods;
import java.util.Scanner;		// Import Scanner class to take input from user

public class Odd_EVEN {		// Class declaration

	static void odd_even(int val_1)  // Static method to check whether a number is odd or even
                                                        // Takes one integer parameter
	{
		if (val_1%2 == 0)		// If the remainder when divided by 2 is zero, the number is EVEN
			System.out.println("The Number "+val_1+" is EVEN");
		else
			System.out.println("The Number "+val_1+" is ODD");
	}
	
	public static void main(String[] args)
	{
		Scanner cs = new Scanner(System.in);
		
		System.out.println("Enter the Value-1 : ");   // Create Scanner object to read input from keyboard
		int val_1 = cs.nextInt();   // Read integer value from user
		odd_even(val_1);            // Call the static method to check odd or even
		
		cs.close(); 	// Close Scanner object to avoid resource leak
	}
}
