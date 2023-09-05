package demo;

public class PrimitiveAndObject {

	public static void main(String[] args) {

		int x=100;
		
		//primitive to Object
		
		Integer y = Integer.valueOf(x);
		

		// Object to Primitive
		
		int z = y.intValue();
		
		
	}

}
