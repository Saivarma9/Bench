package demo;

public class ObjectAndString {

	public static void main(String[] args) {

		long l =1000;
		
		//Primitive to object
		
		Long y = Long.valueOf(l);
		
		//Object to String
		
		String s = y.toString();
		
		//String to Object 
		
		Long z = Long.valueOf(s);
	}

}
