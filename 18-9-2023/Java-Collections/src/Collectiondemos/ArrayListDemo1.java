package Collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		 //Declaring Array List with hetrogeneous data
	    // ArrayList al= new ArrayList();
		  
	      //Declaring Array List with homogeneous data
	     // ArrayList<Integer> al= new ArrayList<Integer>();
		  
		 //Declaring  List
		//List l = new ArrayList();
		
		ArrayList al= new ArrayList();
		
		//Adding elements to arraylist 
		
		al.add(100);
		al.add("WELCOME");
		al.add(10.5);
		al.add('A');
		al.add(true);
		System.out.println("Arraylist "+al);
		
		//Size 
		System.out.println("Arraylist SIZE "+al.size());
		
		
		//Removing elements From arraylist 
		
		 //Using index 
		  al.remove(1);
		    
		  //al.remove("WELCOME");
	       
		  System.out.println("Arraylist After Removing"+ al);
	
	      //INSERTING NEW ELEMENT 
	        
	      al.add(1, "Python");
	      System.out.println("Arraylist After Insertion"+ al);
	      
	      //retriving a specific element
	      
	      System.out.println(al.get(3));
	      
	      //Changing a specific element  
	      al.set(2,"c#");
	      System.out.println("Arraylist After replacing element "+ al);
	
	     //search - contains - returns boolean output 
	      
	      System.out.println(al.contains("c#"));
	      System.out.println(al.contains("c++"));
	
	    //isEmpty()
	     System.out.println (al.isEmpty() ) ;
	      
	   //1)for loop   
	     
//	     System.out.println("Reading elements using for loop.......");
//	     
//	     for(int i=0;i<al.size();i++) {
//	    	 System.out.println(al.get(i));
//	    	
//	     }
	     
	     //2) for each loop 
//	     
//	     System.out.println("Reading elements using for loop.......");
//	     for(Object e : al) {
//	    	 System.out.println(e); 
//	     }
	     
	     //3) Iterator
	     
	     System.out.println("Reading elements using iterator method.......");
	     
	     Iterator it = al.iterator();
	    while(it.hasNext()){
	    	
	    	 System.out.println(it.next());
	    	
	    }
	     
	}
	
}