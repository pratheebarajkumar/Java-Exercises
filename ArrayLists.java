package com.JavaOOPS.com;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> mylist= new ArrayList<String>();
		mylist.add("Apple");
		mylist.add("Mango");
		mylist.add("Orange");
		mylist.add("Pineapple");
		mylist.add(1, "pomme");
		mylist.add(2,"grapes");
		System.out.println("Print all the objects");
		for(String s:mylist) {
			System.out.println(s);
			
		}
		System.out.println("object at index 3 element "+ mylist.get(3));
		System.out.println("Is chicku exixts in the list"+ mylist.contains("chiku"));
		System.out.println("size of arraylist:"+ mylist.size());
		mylist.remove("grapes");
		System.out.println("new size of arraylist" + mylist.size());
		

	}

}
