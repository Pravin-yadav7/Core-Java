//Program to understand  use of TreeSet 
package collection;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		
		//add node in TreeSet
		   ts.add("Ravi");
		   ts.add("Vijay");
		   ts.add("Ravi");
		   ts.add("Ajay");
		   ts.add("sunil");
		   ts.add("jigar");

		//iterate elements from TreeSet
		  Iterator<String> itr=ts.iterator();
		  while(itr.hasNext())
		    System.out.println(itr.next());
		  
		//Remove elements from TreeSet
		  ts.remove("Ravi");
		  ts.remove("jigar");
		  
		//print TreeSet after removing elements
		  System.out.println("after removing elements:");
		  Iterator<String> itr1=ts.iterator();
		  while(itr1.hasNext())
		    System.out.println(itr1.next());
		 
		  
		

	}

}
