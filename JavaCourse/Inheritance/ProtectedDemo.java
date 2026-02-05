package Inheritance;

class MyFather_1 {

    protected void car() {
        System.out.println("Father's Car: Metallic Grey");
    }
}

class MySon_1 extends MyFather_1{
	
	void showcar()
	{
		car();
		System.out.println("Son likes Sizzling Red");
	}
}

public class ProtectedDemo {
	
	public static void main(String[] args) {
		
		MySon_1 caller = new MySon_1();
		caller.showcar();
	}
}

