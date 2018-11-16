package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListConcept {

	//Singly Linked list:Each and every node has 2 parts.
	// first part stores the value and second part stores the reference of the next value or element
	// there are other types of linked list: double linked list and circular linked list
	
	public static void main(String[] args) {
		LinkedList <String> ll = new LinkedList<String>();
		
		// add method
		ll.add("selenium");
		ll.add("Appium");
		ll.add("QTP");
		ll.add("ALM");
		
		// print
		System.out.println("Content of linked list is : "+ll);

	//	add the value in the first index
		
		ll.addFirst("Automation tool");
		
		System.out.println("Content of linked list is : "+ll);
		
	// get and set the value
		System.out.println(ll.get(2));
	// set the value: it will override the index value
		
		ll.set(0, "Automation Testing");
		System.out.println("Content of linked list is : "+ll);
		
		// remove the value
		
		ll.remove(2);
		System.out.println("Content of linked list is : "+ll);
		
		ll.add(2, "Appium");
		
		System.out.println("Content of linked list is : "+ll);
		
		ll.removeFirst();
		System.out.println("Content of linked list is : "+ll);
		
		// different types of printthing the linked list values
		
		System.out.println("1.-------------- forloop----------------");
		
		for(int i=0; i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		
		System.out.println("2. --------Advanced for loop------------");
		
		for(String str:ll){ 
			System.out.println(str);
		}
		
		System.out.println("3. -----------------using Iterator -----------");
		
		Iterator <String> it = ll.iterator();
		while(it.hasNext()){
			String itl = it.next();
			System.out.println(itl);
		}
		
		System.out.println("4. -------------while loop---------");
		int num =0;
		while(num<ll.size()){
			System.out.println(ll.get(num));
			num++;
		}
		
		Iterator<String> it2 = ll.descendingIterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		// checking the linked list is empty or not
		boolean b = ll.isEmpty();
		System.out.println(b);
		
		/*ListIterator<String> it3 = ll.listIterator();
		while(it3.hasNext()){
			System.out.println(it.next());
		}*/
		
		// removes the first value
		ll.poll();
		
		System.out.println("Content of linked list is : "+ll);
		
		ll.offer("test");
		
		System.out.println("Content of linked list is : "+ll);
	}

}
