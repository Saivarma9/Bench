package demo;

public class AllInOne {

	public static void main(String[] args) {

		int x = 100;
		
		// Integer to String 
		
		   String s = Integer.toString(x);
		
		// new integer from string Object using constructor
		
		   Integer y = new Integer(s); 
		
	   // convert Object into primitive    
		   
		   int z = y.intValue();
		   
	   // Coversion of int to object
		   
		   Integer a = new Integer(z);
		   
	  //   convert Object into String
		   
		   String b = a.toString();
		   
      // String to Primitive
		   
		   int c = Integer.parseInt(s);
	}

}
