package Collectiondemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetDemo1 {
	
	public static void main(String[] args) {
	
		
	//HashSet hs = new HashSet(); // default capacity 16 loadfactor 0.75
	
	//HashSet hs = new HashSet(100); // initial capacity 100	
	//HashSet hs = new HashSet(100,0.90); // initial capacity 100 &loadfactor 0.90
	
	HashSet hs = new HashSet(); 
	
	hs.add(100);
	hs.add("Welcome");
	hs.add('A');
	hs.add(10.5);
	hs.add(true);
	hs.add(null);
			
    System.out.println( "Origional HashSet" + hs);
    
    //remove element
    hs.remove(10.5);
    System.out.println("After Removing Element "+ hs);
		
    // Contains() return either true or false
    System.out.println( hs.contains('A'));
    System.out.println( hs.contains('a'));
    
    //isEmpty() return either true or false
    System.out.println( hs.isEmpty());	
    
    
//Reading elements from HashSet using for Loop
 
// using for Loop Cannot done because HashSet doesnot have get() method
	
	
//Reading elements from HashSet using for each Loop
//	for(Object e : hs) {
//		System.out.println(e);
//	}
    
//Reading elements from LinkedList using Iterator()
	Iterator it = hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	}

}
