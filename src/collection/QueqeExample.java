package collection;

import java.util.*;

public class QueqeExample {
	
	public static void main(String []args){
		
		//PriorityQueue object creation
		PriorityQueue<String> queue=new PriorityQueue<String>();
		
		// add elements in Queue
	    queue.add("Pravin");
	    queue.add("Sumit");
	    queue.add("Devendra");
	    queue.add("Ashvin");
	    
	    //print elements from different places in queue
	    System.out.println("At head of the queue:"+queue.element());
	    System.out.println("At head of the queue:"+queue.peek());
	    
	    //Iterating Queue elements
	    System.out.println("Iterating the queue elements:");
	    Iterator<String> itr=queue.iterator();
	    while(itr.hasNext()){
	      System.out.println(itr.next());
	    }
	    
	    //remove elements from queue
	    queue.remove();
	    queue.poll();
	    
	    //Iterating elements from queue after removing elements
	    System.out.println("After removing two elements:");
	    Iterator<String> itr2=queue.iterator();
	    while(itr2.hasNext())
	      System.out.println(itr2.next());
	}

}
