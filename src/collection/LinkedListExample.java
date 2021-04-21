// program to use LinkedList
package collection;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {

		// LinkedList object Creation
		LinkedList<String> lt = new LinkedList<>();

		// add elements in LINkedList by Using Different add() methods
		lt.add("Pravin");
		lt.add("Ashvin");

		lt.add(1, "Devendra");

		lt.addFirst("Sumit");
		lt.addLast("Rohit");

		//print element using SOP statement and ListIterator
		System.out.println(lt);
		ListIterator<String> litr = lt.listIterator();

		while (litr.hasNext()) {

			System.out.println(litr.next() + " ");
		}
		

		// remove elements from LinkedList using different remove() methods
		lt.removeFirst();
		lt.remove("Sumit");
		lt.remove(1);
		

		// print elements of LinkedList after removing elements from LinkedList
		System.out.println(lt);

		ListIterator<String> litr1 = lt.listIterator();

		while (litr1.hasNext()) {

			System.out.println(litr1.next() + " ");
		}
		
		//print previous elements of LinkedList
		System.out.println("Elements of LinkedList in oppsite direction:");
		while (litr1.hasPrevious()) {

			System.out.println(litr1.previous());
		}


	}

}
