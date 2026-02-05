package Example;
import java.util.Scanner;
public class Looping_ex {

	public static void main(String[] args) {
	Scanner cs = new Scanner(System.in);	
    System.out.println("Array Size");
    int size = cs.nextInt();
    int a[] = new int[size];
    System.out.println("Enter the Array Values");
    for(int i=0;i<a.length;i++) {
    System.out.println("Array Element ["+i+"]");
    a[i]=cs.nextInt();
    }
    System.out.println("The Array Values are");
    for(int i=0;i<a.length;i++) {
        System.out.println("Array Element ["+i+"]"+a[i]);
        }
	}

}
