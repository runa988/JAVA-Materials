/*An array is a collection of multiple values of the same data type stored under one variable name.*/

package Arrays;          // Package declaration – groups related classes together

public class Array_1 {    // Class declaration

    public static void main(String[] args) {           // Main method – program execution starts here
        
        int a[] = {1,2,3,4,5,6,7,8,9,10};        // Array declaration and initialization
        														 // This array can store 10 integer values
        
        // for (int i = 0; i <= 9; i++)   ❌ Not recommended (hard-coded limit)
        
        for (int i = 0; i < a.length; i++) {     // Loop runs from index 0 to (array length - 1)
            System.out.println("Array Elements at [" + i + "] = " + a[i]);  // Print array index and its corresponding value
        }
            System.out.println("Array Size : " + a.length);   // Print total number of elements in the array
    }
}

