package collection;

import java.util.*;

public class DequeExample {

	public static void main(String[] args) {
		
		//Object Creation of ArrayDeque
		   Deque<String> deque = new ArrayDeque<String>();  
		   deque.add("Ravi");    
		   deque.add("Vijay");     
		   deque.add("Ajay");    
		   //Traversing elements  
		   for (String str : deque) {  
		   System.out.println(str);  
		   }  


	}

}
