package Files;

import java.io.FileWriter;

public class AppendData {
    public static void main(String[] args) throws Exception {
        
        // Open file in append mode (true)
        FileWriter writer = new FileWriter("sample.txt", true);
        
        // Add new content
        writer.write("\n Faculty Name: Dr. R. Arunkumar");
        writer.write("\n Faculty Dept: CSBS & IoT");
        
        writer.close();
        
        System.out.println("Data appended successfully");
    }
}
