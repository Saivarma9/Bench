package staticmembers;

public class StaticBlockDemo {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
static {
		
		System.out.println("Static Block 1 ........");
	}
	static {
		
		System.out.println("Static Block ........");
	}

}
