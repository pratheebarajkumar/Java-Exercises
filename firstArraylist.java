package com.JavaOOPS.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class firstArraylist {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		ArrayList<String> lstrings =new ArrayList<String>();
		lstrings.add("Red");
		lstrings.add("Blue");
		lstrings.add("Orange");
		System.out.println(lstrings);
		
		for (String element: lstrings) {
			System.out.println(element);
		}
lstrings.add(0, "Pink");

lstrings.add(3, "Yellow");
System.out.println(lstrings);

String element=lstrings.get(0);
System.out.println(lstrings.get(0));
 element = lstrings.get(3);
 System.out.println(element);
lstrings.set(0, "Purple");
 System.out.println(lstrings);
 lstrings.remove(3);
 System.out.println(lstrings);
 System.out.println( "Arraylist contains " + lstrings.contains("Red"));
 Collections.sort(lstrings);
 System.out.println(lstrings);
@SuppressWarnings("unused")
ArrayList<String> lstrings2 = new ArrayList<String>(); 
lstrings2.add("1");
lstrings2.add("2");
lstrings2.add("3");
lstrings2.add("4");
Collections.copy(lstrings2, lstrings);
System.out.println(lstrings2);
Collections.shuffle(lstrings2);
System.out.println(lstrings2 );
Collections.reverse(lstrings2);
System.out.println(lstrings2);

List<String> sub_list= lstrings2.subList(1, 3);
System.out.println(sub_list);
ArrayList<String> c3 = new ArrayList<String>();
for(String e :lstrings) {
	c3.add(lstrings2.contains(e)  ? "Yes" : "No");
	
	
	
}
System.out.println(c3);
 
 c3.addAll(lstrings);
 c3.addAll(lstrings2);
 System.out.println(c3);
 
 Collections.swap(lstrings, 0, 3);
 System.out.println(lstrings);
 ArrayList<String> c1= new ArrayList<String>();
 c1.add("Red");
 c1.add("Green");
 c1.add("Black");
 c1.add("White");
 c1.add("Pink");
 
 @SuppressWarnings("unchecked")
ArrayList<String> newc1 = (ArrayList<String>) c1.clone();
 System.out.println("cloned arraylist" + newc1);
  newc1.clear();
  System.out.println("cleared arraylist" + newc1);
 c1.removeAll(c1);
 System.out.println(c1);
 lstrings.trimToSize();
 System.out.println(lstrings);
	}

}
