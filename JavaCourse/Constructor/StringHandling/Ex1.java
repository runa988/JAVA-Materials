package StringHandling;

public class Ex1 {
	
public static void main(String[] args) {
	String s = "Arunkumar ";
	System.out.println("Orginal String = "+s);
	System.out.println("String Length = " +s.length());
	System.out.println("Character at Index  = "+s.charAt(2));
	System.out.println("UpperFormat = "+s.toUpperCase());
	System.out.println("LowerFormat = "+s.toLowerCase());
	System.out.println("Sub_string = "+s.substring(0, 4));
	System.out.println("String Contain 'kumar' = "+s.contains("kumar"));
	System.out.println("Trim = "+s.trim());
	System.out.println("Replace: " + s.replace('A', 'a'));
	}

}
