package collection;

import java.util.*;

public class TreeMapExample {

	public static void main(String[] args) {
		
		//Object Creation of TreeMap
	    TreeMap<String,String> tm = new TreeMap<String,String>();
	    
	    //put key-value pair in TreeSet
	    tm.put("0830CS171001","Ashvin");
	    tm.put("0830CS171002", "Devendra");
	    tm.put("0830CS171003", "Pravin");
	    tm.put("0830CS171004", "Pratik");
	    tm.put("0830CS171005", "Raj");
	    

	    //Print key-value pair of TreeMap using forEach loop
	    Set<Map.Entry<String,String>> st = tm.entrySet();
	    for(Map.Entry<String,String> me:st)
	    {
	      System.out.print(me.getKey()+":");
	      System.out.println(me.getValue());
	    }


	}

}
