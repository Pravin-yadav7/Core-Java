//Program to understand use of HashSet
package collection;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		
	    HashSet<String> hs = new HashSet<String>();
	    
	    //add elements in HashSet 
	    hs.add("B");
	    hs.add("A");
	    hs.add("D");
	    hs.add("E");
	    hs.add("C");
	    hs.add("A");
	    
	    //print elements of HashSet using SOP statement
	    System.out.println(hs);
	    
	    //remove elements from HashSet
	    hs.remove("D");
	    hs.remove(1);
	    
	    //print after removing element
	    System.out.println(hs);


	}

}
