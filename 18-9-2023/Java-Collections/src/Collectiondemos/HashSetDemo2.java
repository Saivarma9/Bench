package Collectiondemos;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
	
		HashSet<Integer> hs = new HashSet<Integer>(); 
		
		hs.add(2);
		hs.add(4);
		hs.add(6);
				
	    System.out.println( "Even number HashSet : " + hs);

	   //addAll()
	    
	   HashSet<Integer> hs1 = new HashSet<Integer>(); 
	    
	   hs1.addAll(hs);
	   hs1.add(8);
	   System.out.println( "Numbers HashSet : " + hs1);
	
	   //removeAll()
	   hs1.removeAll(hs);
	   System.out.println( "Numbers HashSet After Removing : " + hs1);
	}

}
