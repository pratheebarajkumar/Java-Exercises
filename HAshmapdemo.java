package com.JavaOOPS.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class HAshmapdemo {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1, "Pratheeba");
		hmap.put(2, "Priyanka");
		hmap.put(3, "Raviteja");
		
		
		Set set= hmap.entrySet();
		Iterator iterator =set.iterator();
		while(iterator.hasNext()) {
			Map.Entry me3=(Map.Entry)iterator.next();
			System.out.println("key is: "+ me3.getKey() + " & Value is: " +me3.getValue());
			
		}
		
		String var= hmap.get(2);
		System.out.println("Value of index at 2 is :" + var);
		
		hmap.remove(3);
		
		
		Set set2= hmap.entrySet();
		Iterator iterator2 =set2.iterator();
		while(iterator2.hasNext()) {
			Map.Entry me4= (Map.Entry)iterator2.next();
			System.out.println("key is: "+ me4.getKey() + " & Value is: " +me4.getValue());
		}
		
		
	}
}


