package collection;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		//Object creation of HashMap
	    HashMap< String,Integer> hm = new HashMap< String,Integer>();
	    
	    //add key-value pair in HashMap
	    hm.put("a",100);
	    hm.put("b",200);
	    hm.put("c",300);
	    hm.put("d",400);
	    hm.put("e", 400);

	    //printing key-value pair using forEach loop
	    Set<Map.Entry<String,Integer>> st = hm.entrySet(); 
	    for(Map.Entry<String,Integer> me:st)
	    {
	      System.out.println(me.getKey() + ":" + me.getValue());
	      
	    } 
	    
	    
	    //print entries of HashMap using Iterator
	    
	    Set<Entry<String, Integer>> entrySet = hm.entrySet();
	    
	    // Obtaining an iterator for the entry set
	    Iterator<Entry<String, Integer>> itr = entrySet.iterator();
	 
	    // Iterate through HashMap entries
	    System.out.println("HashMap Key-Value Pairs : ");
	    while(itr.hasNext()){
	    	
	       Map.Entry<String, Integer> me = (Map.Entry<String, Integer>)itr.next();
	       
	       System.out.println(me.getKey() + ":" + me.getValue());
	    } 

	}

}
