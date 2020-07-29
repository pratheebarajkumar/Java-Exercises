package com.JavaOOPS.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class firstHashSet {

	public static void main(String[] args) {
		HashSet<String> hset= new  HashSet<String>();
		hset.add("Water");
		hset.add("Space");
		hset.add("fire");
		hset.add("Earth");
		hset.add("Air");

		
		System.out.println(hset);
		
		for(String e1 : hset) {
			System.out.println(e1);
		}
		System.out.println(hset.size());
		
		
		HashSet<String> newhset= new HashSet<String>();
		newhset = (HashSet<String>) hset.clone();
		System.out.println(newhset);
		
		System.out.println(newhset.removeAll(newhset));
		System.out.println(newhset);
		
		System.out.println(" Is hset Empty:" + newhset.isEmpty());
		
		String[] newarray= new  String[hset.size()];
		hset.toArray(newarray);
		
		for (String e2: newarray) {
			
			System.out.println(e2);
		}
		
		Set<String> treeset= new TreeSet<String>(hset);
		for(String e3 :treeset) {
			System.out.println(e3);
		}
		
		List<String> ArrayList =new ArrayList<String>(hset);
		System.out.println("ArrayLIst:" + ArrayList);
		
		for(String e4:hset) {
			System.out.println(hset.contains(e4) ? "yes" : "No");	
		}
		
	}

}
