package Collectiondemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("b");
		al.add("c");
		
       //addAll from existing to new list 
		ArrayList al1 = new ArrayList();
		al1.addAll(al);
		System.out.println(al1);
		
	   //removeAll from existing list 
		al1.removeAll(al);
		System.out.println("After Removing : "+al1);
		
		//sorting ---- Collections.sort()
		System.out.println("Elements in the ArrayList: "+al);		
        Collections.sort(al);
        System.out.println("Elements in the ArrayList After Sorting : "+al);
        
        //Printing in Reverse Order 
        Collections.sort(al,Collections.reverseOrder());
        
        //Shuffling ---- Collections.shuffle()
        Collections.shuffle(al);
        System.out.println("Elements in the ArrayList After Shuffling : "+al);
        
	}

}
