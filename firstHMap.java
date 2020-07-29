package com.JavaOOPS.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class firstHMap {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hhmap= new HashMap<Integer,String>();
	
		hhmap.put(1, "Red");
		hhmap.put(2, "Green");
		hhmap.put(3, "Black");
		hhmap.put(4, "White");
		hhmap.put(5, "Blue");
		
		for(Map.Entry x: hhmap.entrySet() ) {
			System.out.println(x.getKey() +"  " + x.getValue());
		}
		  System.out.println("Size of hmap" + hhmap.size());
		  
		  HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
		  hash_map2.put(4, "White");
		  hash_map2.put(5, "Blue");
		  hash_map2.put(6, "Orange");
		  System.out.println("\nValues in second map: " + hash_map2);
		  
		  hash_map2.putAll(hhmap);
		  System.out.println(hash_map2);
		  hash_map2.clear();
		  System.out.println(hash_map2.isEmpty());
		  
		  HashMap<Integer,String> newhmap = new HashMap<Integer,String>();
		  newhmap=(HashMap<Integer, String>) hhmap.clone();
		  System.out.println(newhmap);
		  
		  System.out.println(newhmap.containsKey(6) + "Does hashmap contains this key??");
		  
		  System.out.println(newhmap.containsKey(3) + "Does hashmap contains this key??");
		  
		  System.out.println(newhmap.containsValue("Purple") + "Does hashmap contains this Value??");
		  
		  Set set= newhmap.entrySet();
		  System.out.println(set);
		  System.out.println(newhmap.get(5));
		  Set keyset= newhmap.keySet();
		  System.out.println(keyset);
		  System.out.println(newhmap.values());
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
