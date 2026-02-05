//Program supports ONLY square matrices
package Matrics;

import java.util.Scanner;

public class Matrix_Mul{
	
	public void Matrix_Multiplication(Scanner cs)  // Method to perform matrix multiplication
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
		
		 // Matrix Multiplication Logic c[i][j] += a[i][k] * b[k][j];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				c[i][j]=0;
				for(int k=0;k<col;k++) {
				c[i][j] +=  a[i][k] * b[k][j];
				}
			}
		}
		
		System.out.println("***2-D Matrix Multiplication Result***"); // Print  matrix multiplication: 
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("c ["+i+"]["+j+"] : " +c[i][j]);
				}
			}
		}
	
	public static void main(String[] args) {
	
		Scanner cs = new Scanner(System.in);  // Create Scanner object
		Matrix_Mul caller  = new Matrix_Mul(); // Create object of Matrix_multiplication class
		caller.Matrix_Multiplication(cs);  // Call matrix multiplication method
		cs.close();
		}
}