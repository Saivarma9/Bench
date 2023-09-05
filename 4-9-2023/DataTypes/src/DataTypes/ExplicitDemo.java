package DataTypes;

public class ExplicitDemo {

	public static void main(String[] args) {
		
		//Explicit type casting with in the range
		
		  int i =100;
		  byte b =(byte) i;
	      System.out.println(b);
		
		  int x=97;
		  char ch = (char)x;
		  System.out.println(x);
		
		//Explicit type casting beyond the range
		
		  int y =130;
		  byte c =(byte) y;
		  System.out.println(c);
		
		  int z =640;
		  byte d =(byte) z;
		  System.out.println(d);
		
		
	}
}
