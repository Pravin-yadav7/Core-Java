//program to understand LinkedHashSet
package collection;

import java.util.*;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		//add elements in LinkedHashSet
	    lhs.add("B");
	    lhs.add("A");
	    lhs.add("D");
	    lhs.add("E");
	    lhs.add("C");
	    lhs.add("F");
	    
	    //print elements of LikedHashSet
	    System.out.println(lhs);
	    
	    //remove elements from LinkedHashSet
	    lhs.remove("B");
	    lhs.remove("C");
	    
	    //print after removing elements from LinkedHashSet
	    System.out.println(lhs);
	    
	    

	}

}
