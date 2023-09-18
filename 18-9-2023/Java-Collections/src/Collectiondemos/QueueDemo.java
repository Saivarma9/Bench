package Collectiondemos;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue  q = new PriorityQueue();

		//For adding .......  add() & offer()
		
		q.add("A");
		q.add("B");
		q.offer("C");
		q.offer("C");
		
		//q.offer(100); //(Heterogenious data)not allowed in PriorityQueue
		System.out.println(q);
		
		//For retriving head element......... element() & peek()

		//System.out.println(q.element()); // if Queue is empty returns exception i.e., java.util.NoSuchElementException
		
		//System.out.println(q.peek()); // if Queue is empty returns null 
	
		//For return & remove head element..... remove() & poll()
		
		//System.out.println(q.remove());
		
		//System.out.println(q.poll());
		
		//for reading the elements in Queue
		
//		Iterator it =  q.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		for(Object e : q) {
			System.out.println(e);
			
		}
		
	}

}
