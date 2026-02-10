package Files;

import java.io.File;

public class FCreation {
    public static void main(String[] args) throws Exception {
    	
        File file = new File("sample.txt");

        if (file.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }
    }
}
