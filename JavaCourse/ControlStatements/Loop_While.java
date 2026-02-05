package ControlStatements;
import java.util.ArrayList;
import java.util.Scanner;

public class Loop_While {
	
	public static void main(String[] args) {
		
		Scanner cs = new Scanner(System.in);
		
		System.out.print("Required Size for the String_ArrayList:");
		int Size = cs.nextInt();
		cs.nextLine();
		ArrayList<String> a =  new ArrayList<String>();
		System.out.println("Enter the String_ArrayList");
		
		int i=0;
		while (i<Size) {
			System.out.print("String_ArrayList ["+i+"] : ");
			a.add(cs.nextLine());
			i++;
		}
		
		System.out.println("String_ArrayList Elements are : " +a);
		cs.close();	
	}

}
