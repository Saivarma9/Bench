package Collectiondemos;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		//Declaration 
		LinkedList l = new LinkedList();
		
		//Declaration to store similar type of data
		//LinkedList<String> l = new LinkedList<String>();
		//LinkedList<Integer> l = new LinkedList<Integer>();
	
	
	l.add(100);
	l.add("Welcome");
	l.add('A');
	l.add(10.5);
	l.add(true);
	l.add(null);
	
	System.out.println(l);
	
	//to calculate size
	System.out.println(l.size());
	
	//remove
	l.remove(3);
	System.out.println(" After Removing Element "+ l);
	
	//Inserting or adding element in middle of the LinkedList
	l.add(3, "JAVA");
	System.out.println(" After Inserting Element "+ l);
	
	//Retriving the value 
	System.out.println(l.get(3));
	
	//changing the value 
	l.set(5,"X");
	System.out.println(" After Changing Element " + l);
	
	//Contains checking for values present in linkedlist or not
	System.out.println( l.contains("X"));
	System.out.println( l.contains("Python"));
	
	//isEmpty()
	System.out.println(l.isEmpty());
	
	//Reading elements from LinkedList using for Loop
	
//	for(int i=0;i<l.size();i++) {
//		System.out.println(l.get(i));
//	}
//	
	
	//Reading elements from LinkedList using for each Loop
//	for(Object e : l) {
//		System.out.println(e);
//	}
	
	//Reading elements from LinkedList using Iterator()
	Iterator it = l.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}
	
	
	

}
