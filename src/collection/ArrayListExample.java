
// Program to use ArrayList
package collection;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {

		// Creation of ArrayList Object

		ArrayList<String> l = new ArrayList<String>();
		ArrayList<String> l1 = new ArrayList<String>();

		// add elements in ArrayList with different add() methods
		l.add("Pravin");
		l.add("Devendra");
		l.add("Sachin");

		l.add(3, "Sumit");
		l.add(1, "Ashvin");

		l1.addAll(l);

		l1.addAll(2, l);
		
		
		//Print or iterate elements by using  Sop statement, forEachLoop and iterator method
		System.out.println(l);
		System.out.println(l1);
		for (String element : l) {

			System.out.println(element);
		}

		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {

			System.out.print(itr.next() + " ");
		}
		
		

		//Remove elements from ArrayList by using different remove methods
		
		l.remove(1);
		l.remove("ashvin");
		l1.removeAll(l);
		
		//Print elements of ArrayList after remove elements
		System.out.println(l);
		System.out.println(l1);

		for (String element : l) {

			System.out.println(element);
		}

		Iterator<String> itr1 = l.iterator();
		while (itr.hasNext()) {

			System.out.print(itr1.next() + " ");
		}

	}

}
