
public class SingleInheritance {
	
	void m1() {
		System.out.println("Inside M-1");
	}
	
	public static void main(String[] args) {
		
		SingleInheritance s = new SingleInheritance();
		
		System.out.println("Inside Main");
			
		s.m1();
		
		//we can access the below methods because they are present in java.lang.object class
		
		s.hashCode();
		s.getClass();
		
		//we can't access the below method bcz it is not declared in any class
		//s.m2();
	}
	

}
