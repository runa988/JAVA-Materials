package Class_Methods;
import java.util.Scanner;
public class Prime {
	
	public static void main(String[] args)
	{
		Scanner cs = new Scanner (System.in);
		System.out.println("Enter the Number : ");
		int num = cs.nextInt();
		
		if (num <= 1)
		{
			System.out.println("Number "+num+" is not Prime");
		    cs.close();
		    return;
		}
		
		boolean is_prime = true;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%2==0)
			{
				is_prime = false;
				break;
			}
		}
		
		if (is_prime)
			System.out.println("Number "+num+" is Prime");
		else
			System.out.println("Number "+num+" is Not Prime");
		cs.close();
	}

}
