package Matrics;
import java.util.Scanner;

public class MultidimentionArray {

	public static void main(String[] args) {
	Scanner cs = new Scanner(System.in);       // Create Scanner object
	
	System.out.println("Enter the Size of the 2-D Array (Row/Column) : ");
	System.out.print("Row : ");
	int row = cs.nextInt();    // Number of rows
	System.out.print("Column : ");
	int col = cs.nextInt();     // Number of columns
	int a[][] = new int[row][col];    // Declare 2-D array with given rows and columns
	
	System.out.println("Enter the 2-D ArrayElement");
	// Loop to read elements of 2-D array
	for (int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			System.out.print("Array Element ["+i+"]["+j+"] : ");
			a[i][j]=cs.nextInt();
			}
		}
	
	 System.out.println("***2-D Array Elements are***");
	// Loop to display elements of 2-D array
	for (int i=0;i<row;i++)
		for(int j=0;j<col;j++)
			System.out.println("Array Element ["+i+"]["+j+"] : " +a[i][j]);    // Print element with index position
	
	cs.close();
		
	}
}
