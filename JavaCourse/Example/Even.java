package Example;
import java.util.Scanner;
public class Even {

	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		System.out.print("Enter the  a value =" );
		int a = cs.nextInt();
		System.out.print("Enter the  b value =" );
		int b = cs.nextInt();
     if(a<b)
     {
    	 System.out.print("The value "+b+" is Greater ");
     }
     else
    	 System.out.print("The value "+a+" is Greater");
	}
}
    
