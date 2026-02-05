package Example;
import java.util.Scanner;
public class User_Input_variousType {
	
	public static void main(String[] args)
	{
		Scanner cs = new Scanner(System.in);
		
		int repeat;
		do
		{		
			System.out.println("Various Input at Run Time ");
			System.out.println("1. Integer Type");
			System.out.println("2. Float Type ");
			System.out.println("3. Char Type ");
			System.out.println("4. String Type ");
			System.out.println("5. Boolean Type ");
			System.out.print("Enter Your Choice :  ");
			int choice = cs.nextInt();
			
		switch(choice)
		{
		case 1:
			System.out.print("You chose Integer data type. Enter value :");
			int int_var = cs.nextInt();
			System.out.print("Your Interger Value : " +int_var);
			break;
			
		case 2:
			System.out.print("You chose Float data type. Enter value : ");
			float float_var = cs.nextFloat(); 
			System.out.print("Your Float Value : " +float_var);
			break;
			
		case 3:
			System.out.print("You chose Character data type. Enter value :: ");
			char c_var = cs.next().charAt(0); 
			System.out.print("Your Character Value : " +c_var);
			break;
		
		case 4:
			cs.nextLine();
			System.out.print("You chose String data type. Enter value : ");
			String  s_var = cs.nextLine(); 
			System.out.print("Your String Value : " +s_var);
			break;
			
		case 5:
			System.out.print("You chose Boolean data type. Enter value : ");
			boolean b_var = cs.nextBoolean();
			System.out.print("Your Boolean Value : " +b_var);
			break;
			
		default:
			System.out.println("Invalid Input");
		}	
		
		System.out.print("\nDo you want to continue? (y/n): ");
        repeat = cs.next().charAt(0);
			
	}while(repeat == 'y' || repeat == 'Y');
	cs.close();
	}
}

