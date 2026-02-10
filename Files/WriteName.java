package Files;

import java.io.FileWriter;

public class WriteName {
    public static void main(String[] args) throws Exception {
        
        // Create FileWriter object
        FileWriter writer = new FileWriter("sample.txt");
        
        // Write your name
        writer.write("Class Name: II CSBS - JAVA PROGRAMMING");
        
        // Close the file
        writer.close();
        
        System.out.println("Name written to file successfully");
    }
}
