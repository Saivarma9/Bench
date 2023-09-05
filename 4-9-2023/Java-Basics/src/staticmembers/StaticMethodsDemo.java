package staticmembers;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("Main Method is Running .........");
		StaticMethodsDemo.main();
	}
	
	static void main() {
		System.out.println("Static Method is Running .........");
	}

	static  {
		System.out.println("Static Block is Running .........");
		
		StaticMethodsDemo.main();
	}

}
