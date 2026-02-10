package Files;

import java.io.File;
import java.util.Scanner;

public class ReadName {
    public static void main(String[] args) throws Exception {
        
        // Open the file
        File file = new File("sample.txt");
        
        // Create Scanner object to read file
        Scanner sc = new Scanner(file);
        
        // Read and display content
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        
        sc.close();
    }
}
