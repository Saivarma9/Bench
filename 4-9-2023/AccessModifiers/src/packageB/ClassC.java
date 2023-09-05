package packageB;

import packageA.ClassA;

public class ClassC extends ClassA{

	
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		
		System.out.println(a.w);
	
		ClassC c = new ClassC();
		
		System.out.println(c.z);
		
		System.out.println(c.w);
		
	}
}
