package ArrayList;

import java.util.ArrayList;   // Import ArrayList class

public class ArrayList_1 {
	
public static void main(String[] args)
{
	ArrayList <Integer> List =  new ArrayList <Integer> ();     // Create an ArrayList of Integer type

	
	List.add(10);  // Adding elements to the ArrayList
	List.add(20);
	List.add(30);
	List.add(40);
	
	System.out.println("ArrayList Elements are : " + List);
	System.out.println("ArrayList Size is : " +List.size());
	System.out.println("ArrayList element at 2 is : " +List.get(2));
	List.set(2, 300);
	System.out.println("ArrayList element at [2] = 30, Now change to " +List);
	List.add(50);
	System.out.println("Adding an element to existing ArrayList :  " +List);
	List.add(2, 200);
	System.out.println("Adding an element at Intex [2] in the existing ArrayList :  " +List);
	System.out.println("An element at Intex [0] in the ArrayList :  " +List.get(0));
	System.out.println("An element at Intex [5] in the ArrayList :  " +List.get(List.size()-1));
	System.out.println("Type :  " +List.getClass());
}

}
