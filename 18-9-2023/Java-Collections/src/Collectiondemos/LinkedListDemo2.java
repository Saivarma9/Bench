package Collectiondemos;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
     LinkedList l = new LinkedList();
    
        l.add("x");
		l.add("y");
		l.add("z");
		l.add("a");
		l.add("b");
		l.add("c");
		
		System.out.println(l);
		
		
		LinkedList l1 = new LinkedList();
		l1.add("A");
		l1.addAll(l);
		System.out.println(l1);
		
		l1.removeAll(l);
		System.out.println(l1);
		
		//Sorting 
		System.out.println("Before Sorting" + l);
		Collections.sort(l);
		System.out.println("After Sorting" + l);
		
		//reverse order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("After Reversing " + l);

		//Shuffling
		
		Collections.shuffle(l);
		System.out.println("After Shuffling" + l);

	}

}
