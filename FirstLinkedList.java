package com.JavaOOPS.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FirstLinkedList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> llist=new LinkedList<String>();
		llist.add("Pratheeba");
		llist.add("Priyanka");
		llist.add("Raviteja");
		llist.add("Srinija");
		llist.add("Nikitha");
		
		
		System.out.println(llist);
		
		for(String element : llist) {
			System.out.println(element);
		}
		
		@SuppressWarnings("rawtypes")
		Iterator p=llist.listIterator(2);
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		Iterator IT= llist.descendingIterator();
		while(IT.hasNext()) {
			System.out.println(IT.next());
		}
		llist.add(3, "Rajkumar");
		System.out.println(llist);
		llist.addFirst("Saileela");
		llist.addLast("Palakkad");
		System.out.println(llist);
		llist.offerFirst("Chennai");
		llist.offerLast("Hyderabad");
		System.out.println(llist);
		llist.removeFirst();
		llist.removeLast();
		llist.remove(3);
		System.out.println(llist);
		Collections.swap(llist, 0, 3);
		System.out.println(llist);
		Collections.shuffle(llist);
		System.out.println("Shuffled list:" + llist);
		
		
		LinkedList<String> newlist= new LinkedList<String>();
		newlist	=(LinkedList<String>) llist.clone();
		System.out.println("cloned list:"+newlist);
		newlist.pop();
		System.out.println(newlist.pop());	
		String x =newlist.peekFirst();
		System.out.println(x);
		String x1=newlist.peekLast();
		System.out.println(x1);
		
		System.out.println(llist.contains("Saileela"));
		List<String> arlst= new ArrayList<String>(newlist);
		System.out.println(newlist);
		
		LinkedList<String> c3= new LinkedList<String>();
		for (String e5:llist) {
			c3.add(newlist.contains(e5) ? "Yes" : "No");
			
		}
		System.out.println(c3);
		System.out.println(llist.isEmpty());
	llist.set(1, "Priyanka");
	System.out.println(llist);
	llist.set(2, "Priyanka");
	System.out.println(llist);
	llist.set(3, "Priyanka");
	System.out.println(llist);
		}
	}


