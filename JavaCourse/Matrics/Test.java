package Matrics;

public class Test {
    static void sum(int a, int b)
    {
    	System.out.println("Sum = "+(a+b));
    }
  int mul(int a, int b)
    {
    	return (a*b);
        //return c;
    }
	public static void main(String[] args) {
    int a =10, b =20;
    Test caller = new Test();
    sum(a, b);
    //int z = caller.mul(a,b);
    System.out.println("Product = "+caller.mul(a,b));
    

	}

}
