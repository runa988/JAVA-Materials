package ControlStatements;
import java.util.Scanner;
public class Loopings {
	
	public static void main(String[] args)
	{
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = cs.nextInt();
		int a[] = new int[size]; 
		for(int i=0; i<size;i++)
		{
			System.out.println("Array element "+i+"");
		    a[i]= cs.nextInt();
	     } 
		int i =0;
do
		{
			System.out.println("Array element ["+i+"]" +a[i]);
			i++;
		}while(i<size);
		}
}
