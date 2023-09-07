
public abstract class BMW {
	
	//Common Across All BMW Series Cars
	
	void commonFun() {
		System.out.println("Inside Common Function ");
	}
	
	//Only for Specific Series of BMW Cars
	abstract void accelerate();
	
	//We can have main method inside abstract class 
	
	public static void main(String[] args) {
		System.out.println("Inside Main Method");
	}

}
