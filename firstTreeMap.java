package com.JavaOOPS.com;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map.Entry; 

public class firstTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap= new TreeMap<Integer,String>();
		tmap.put(1, "Water");
		tmap.put(3,"Space");
		tmap.put(5,"fire");
		tmap.put(2,"Earth");
		tmap.put(4,"Air");
		
		for(Map.Entry<Integer, String> entry :tmap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		TreeMap<Integer,String> tmap2 = new TreeMap<Integer,String>();
		tmap2.put(6,"Pratheeba");
		tmap2.put(7,"Rajkumar");
		System.out.println(tmap2);
		tmap2.putAll(tmap);
		System.out.println(tmap2);
		System.out.println(tmap2.containsKey(3));
		System.out.println(tmap2.containsValue("Ai"));
		
		Set keyset= tmap.keySet();
		
			System.out.println(keyset);

	tmap2.clear();
	System.out.println(tmap2);
	System.out.println(" Greatest Key" + tmap.firstEntry());
	System.out.println("Least Key:" + tmap.lastEntry());
	System.out.println(tmap.descendingKeySet());
	System.out.println("this will give you a value less than the given key:"+ tmap.floorEntry(4));

	System.out.println("This will give the whole value set below the given keyset:" + tmap.headMap(4));
	System.out.println(tmap.higherEntry(3));
	System.out.println(tmap.navigableKeySet());
	System.out.println(tmap.pollFirstEntry());
	System.out.println(tmap);
	
	Map<Integer,String> subtmap= tmap.subMap(2, 4);
	System.out.println(subtmap);
	System.out.println( "This will give the whole treemap above given key value:" + tmap.tailMap(3));
	
	
	
	
	}
		
		
		
		
		
		
		
	}


