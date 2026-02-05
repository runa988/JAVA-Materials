package Pkg1;                 // Package declaration – Class_1 belongs to package Pkg1

public class Class_1 {    // Public class – can be accessed from other packages

    public void display() {      // Public method – accessible from any package
    	
        System.out.println("Welcome to the 'class -1'- Located in 'Package -1', Where display() access is Public");        
        // Print message on the console
    }
    
    protected void print()
    {
    	System.out.println("Welcome to the 'class -1'- Located in 'Package -1', Where print() access is Protected");
    }
}

