package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_3 {
	
	public void Int_ArrayList(Scanner cs)
	{
		System.out.print("Enter Interger ArrayList size : ");
		int int_size = cs.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for (int i=0;i<int_size;i++) {
		System.out.print("Enter the Integer Value ["+i+"]: ");
		a.add(cs.nextInt());
		}
		System.out.println("\nUser Interger ArrayList Elements");
		for (int i=0;i<int_size;i++) {
		System.out.println("Integer ArrayList Value ["+i+"]: " +a.get(i));
		}
	}
	
	public void Float_ArrayList(Scanner cs)
	{
		System.out.print("Enter Float ArrayList size : ");
		int Float_size = cs.nextInt();
		ArrayList<Float> b = new ArrayList<Float>();
		
		for (int i=0;i<Float_size;i++) {
		System.out.print("Enter the Integer Value ["+i+"]: ");
		b.add(cs.nextFloat());
		}
		System.out.println("\nUser Float ArrayList Elements");
		for (int i=0;i<Float_size;i++) {
		System.out.println("Integer ArrayList Value ["+i+"]: " +b.get(i));
		}
	}
	
	public void Char_ArrayList(Scanner cs)
	{
		System.out.print("Enter Character ArrayList size : ");
		int Char_size = cs.nextInt();
		ArrayList<Character> c = new ArrayList<Character>();
		
		for (int i=0;i<Char_size;i++) {
		System.out.print("Enter the Character ["+i+"]: ");
		char ch = cs.next().charAt(0);
		c.add(ch);
		}
		System.out.println("\nUser Character ArrayList Elements");
		for (int i=0;i<Char_size;i++) {
		System.out.println("Character ArrayList ["+i+"]: " +c.get(i));
		}
	}
	
	public void String_ArrayList(Scanner cs)
	{
		System.out.print("Enter String ArrayList size : ");
		int String_size = cs.nextInt();
		cs.nextLine();
		ArrayList<String> d = new ArrayList<String>();
		
		for (int i=0;i<String_size;i++) {
		System.out.print("Enter the String ["+i+"]: ");
		d.add(cs.nextLine());
		}
		System.out.println("\nUser String ArrayList Elements");
		for (int i=0;i<String_size;i++) {
		System.out.println("String ArrayList word ["+i+"]: " +d.get(i));
		}
	}

	public static void main(String[] args) {
		
		Scanner cs = new Scanner(System.in);
		ArrayList_3 Int_caller = new ArrayList_3();
		ArrayList_3 Float_caller = new ArrayList_3();
		ArrayList_3 Char_caller = new ArrayList_3();
		ArrayList_3 String_caller = new ArrayList_3();
		
		System.out.println("***MENU LIST***");
		System.out.println("1.Interger ArrayList");
		System.out.println("2.Float ArrayList");
		System.out.println("3.Char ArrayList");
		System.out.println("4.String  ArrayList");
		System.out.println("Enter Your Choice for ArrayList-Type : ");

		int choice = cs.nextInt();
		/*
		System.out.println("Your Using If-elseif");
		if (choice == 1)
			Int_caller.Int_ArrayList(cs);
			else if (choice == 2)
			Float_caller.Float_ArrayList(cs);
			else if (choice == 3)
			Char_caller.Char_ArrayList(cs);
			else if (choice == 4)
			String_caller.String_ArrayList(cs);
		else
			System.out.println("Enter the right ArrayList Creation"); */
		
		switch (choice){
		case 1:
			Int_caller.Int_ArrayList(cs);
			break;
		case 2:
			Float_caller.Float_ArrayList(cs);
			break;
		case 3:
			Char_caller.Char_ArrayList(cs);
			break;
		case 4:
			String_caller.String_ArrayList(cs);
			break;
		default :
			System.out.println("Enter the right ArrayList Creation");
		}
			
	}
}
	
