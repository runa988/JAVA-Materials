package ArrayList; // Package declaration – groups related classes

public class ArrayList_2 {

    public static void main(String[] args) {        // Main method – execution starts here
    	  // Declare and initialize a String
        String Msg = "Be, Happy, Always, and, Keep, Your, Mind, Clear, and, Creative";
         // Split the String using comma (,) delimiter
        // Result is stored in a String array
        
        String data[] = Msg.split(",");
        System.out.println("String before split : " + Msg);         // Print original String
        System.out.println("\nSplitted data are :");                  // Print heading

        for (int i = 0; i < data.length; i++) {               // Loop through split String array
            System.out.println("Data at [" + i + "] : " + data[i]);              // Print index and value
        }
        
     // Prints number of characters in the String
        System.out.println("\nString character count (Msg.length()) : " + Msg.length());
        
     // Prints number of elements in the array

        System.out.println("Number of words after split (data.length) : " + data.length);
        
    // Prints character at index position 4   
        System.out.println("Character at index 4 (charAt) : " + Msg.charAt(4));
       
     // Converts String to lowercase and uppercase
        System.out.println("Lowercase String : " + Msg.toLowerCase());
        System.out.println("Uppercase String : " + Msg.toUpperCase());
       
     // Checks whether the String contains the word "and"
        System.out.println("Contains 'and' : " + Msg.contains("and"));
       
    // Checks whether String starts with "Be"
        System.out.println("Starts with 'Be' : " + Msg.startsWith("Be"));
        
    // Checks whether String ends with "tive"
        System.out.println("Ends with 'tive' : " + Msg.endsWith("tive"));
        
    }
}
