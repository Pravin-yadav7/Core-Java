package collection;

import java.util.*;
import java.util.Map.Entry;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		//Object creation of LinkedHashMap
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		
		//put key-value pair in LinkedHashMap
	    lhm.put(101,"Ashvin");
	    lhm.put(102,"Devendra");
	    lhm.put(103,"Devendra Birla");
	    lhm.put(104,"Pravin");
	    lhm.put(105, "Sumit");
	    
	    

	    //print key-value pair using forEach loop
	    Set<Map.Entry<Integer,String>> st = lhm.entrySet();
	    for(Map.Entry<Integer,String> me:st)
	    {
	      System.out.print(me.getKey()+":");
	      System.out.println(me.getValue());
	      
	    }
	    
	    //print entries of LinkedHashMap
	    Set<Entry<Integer,String>> es = lhm.entrySet();
	    
	    // Obtaining an iterator for the entry set
	    Iterator<Entry<Integer,String>> itr = es.iterator();
	    
	 // Iterate through HashMap entries
	    System.out.println("HashMap Key-Value Pairs : ");
	    while(itr.hasNext()){
	    	
	       Map.Entry<Integer,String> me = (Map.Entry<Integer,String>)itr.next();
	       
	       System.out.println(me.getKey() + ":" + me.getValue());
	    }

	}

}
