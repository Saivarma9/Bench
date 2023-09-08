package Collectiondemos;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		//declaration for homogenious data
		//LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

		//declaration for heterogenious data
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		lhs.add(500);
		
		System.out.println(lhs);
	}

}
