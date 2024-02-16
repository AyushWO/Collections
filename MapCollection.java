package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapCollection {
	
	//It's not sequence based and duplicates are not allowed, just like set interface.
	//If you are trying to duplicate the key with a different value then that value(latest value) will be printed.  
	
	public static void main(String[] args) {
		
		Map<String,Integer> m = new HashMap<>();
		m.put("Pizza", 100);
		m.put("Burger", 40);
		m.put("FrenchFries", 10);
		m.put("Dabeli", 20);
		m.put("Pizza", 100);
		m.put("Burger", 40);
		m.put("FrenchFries", 10);
		m.put("Dabeli", 2);
		
		System.out.println(m);
		System.out.println(m.keySet());
		for(String i : m.keySet()) {
			System.out.println(i+" : "+m.get(i));
		}
		
		//HashMap uses asynchronized implementation and HashTable is used for synchronized implementation.
	}
}
