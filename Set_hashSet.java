package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_hashSet {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>(); //order is not conserved but it way faster than the treeset
//		Set<String> s = new TreeSet<>(); //order is conserved
		s.add("Arun");
		s.add("Lokesh");
		s.add("Denny");
		s.add("Rahul");
		s.add("Arun");
		s.add("Lokesh");
		s.add("Denny");
		s.add("Rahul");
		System.out.println(s);
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
