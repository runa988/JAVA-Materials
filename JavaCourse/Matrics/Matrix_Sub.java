package Matrics;
import java.util.Scanner;

public class Matrix_Sub {
	
	public void Matrix_Subtraction(Scanner cs)  // Method to perform matrix subtraction
	{
		System.out.println("Enter the Row & Column of 2-D Matrix");
		
		 // Read number of rows & columns
		System.out.print("Row of a & b Matrix : ");
		int row = cs.nextInt();
		
		System.out.print("Column of a & b Matrix :");
		int col = cs.nextInt();
		
		// Declare matrices A, B, and C
		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		int c[][] = new int[row][col];
		
		System.out.println("***Enter the A - Matrix Values***"); // Read matrix A values
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("a ["+i+"]["+j+"] : ");
						a[i][j] = cs.nextInt();
				}
			}
		
		System.out.println("***Enter the B - Matrix Values***"); // Read matrix B values
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("b ["+i+"]["+j+"] : ");
						b[i][j] = cs.nextInt();
				}
			}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				c[i][j] = a[i][j] - b[i][j];
				}
			}
		
		System.out.println("***2-D Matrix Subtraction Result***"); // Perform matrix addition: C = A - B
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("c ["+i+"]["+j+"] : " +c[i][j]);
				}
			}
		}
	
	public static void main(String[] args) {
	
		Scanner cs = new Scanner(System.in);  // Create Scanner object
		Matrix_Sub caller  = new Matrix_Sub(); // Create object of Matrix_sub class
		caller.Matrix_Subtraction(cs);  // Call matrix subtraction method
		cs.close();
		}
}