package Nonstaticmembers;

public class NonStaticDemo {
	
	//Non-static-variable
	int num;
	
	//constructor
	NonStaticDemo(){
		System.out.println("Inside Constructor.......");
	}
	
	//Non-static-Block
	{
		System.out.println("Inside Non-Static-Block.......");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside Main Method.......");
		
		NonStaticDemo obj = new NonStaticDemo();

    // Invoking Non-Static Method
		
		obj.doSomething();
	}
	
	static {
		
		System.out.println("Inside Static-Block.......");
	}
	
	void doSomething() {
		
		System.out.println("do Something...........");
	}

}
