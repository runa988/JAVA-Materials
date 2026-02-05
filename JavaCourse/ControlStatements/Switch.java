package ControlStatements;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		Scanner cs = new Scanner(System.in);
				
		System.out.println("* $$ Welcome to the Currency Counting Machine $$ *");
		System.out.print("Enter the Amount :");
		int Amount = cs.nextInt();
		System.out.println("Currency Denomination Menu ");
		System.out.println("1. 100 Rupess");
		System.out.println("2. 200 Rupess");
		System.out.println("3. 500 Rupess");
		System.out.println("4. 1000 Rupess");
		System.out.print("Enter the Your Denomination : ");
	
		int  choice = cs.nextInt();
		switch (choice) {
		case 1:
				int count_100 = Amount/100;
			    System.out.println("No's of 100's for the ["+Amount+"] are : "  +count_100);
				break;
		case 2:
				int count_200 = Amount/200;
				System.out.println("No's of 200's for the ["+Amount+"] are : "  +count_200);
				break;
		case 3:
				int count_500 = Amount/500;
				System.out.println("No's of 500's for the ["+Amount+"] are : "  +count_500);
				break;
		case 4:
				int count_1000 = Amount/1000;
				System.out.println("No's of 1000's for the ["+Amount+"] are : "  +count_1000);
				break;
		default:
			System.out.println("Enter the Correct Denomination");
		}
		cs.close();
		}

}
