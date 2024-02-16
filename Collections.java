package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		
		//Collection: It'a framework. It provides the way to store and manipulate the group of objects.
		//A Collection represents a single unit of objects, i.e., a group.
		/*Collections operations: add(E e), 
		 addAll(Collection<?extends E>c), 
		 remove(Object element),
		 removeAll(collection<?> c),
		 removeIf(Predicate<? super E> filter),
		 size(),
		 clear(),
		 contains(Object element),
		 isEmpty(),
		 get(int index),
		 equals(Object o),
		 indexOf(Object o),
		 add(int index, E element),
		 hashCode(),
		 Collections.sort()
		*/
		List<String> arr = new ArrayList<String>();
		System.out.println("In list, order of sequesnce matters and dupplictes are allowed");
		arr.add("hello1");
		arr.add("hello2");
		arr.add("hello3");
		arr.add("hello4");
		arr.add("hello5");
		arr.add("hello1");
		arr.add("hello2");
		arr.add("hello3");
		arr.add("hello4");
		arr.add("hello5");
		
		for (String i : arr) {
			System.out.println(i);
		}
		
		System.out.println();
		
		Set<String> arr1 = new HashSet<String>();
		System.out.println("In set, no order of sequesnce matters and dupplictes are not allowed");
		arr1.add("hello1");
		arr1.add("hello2");
		arr1.add("hello3");
		arr1.add("hello4");
		arr1.add("hello5");
		arr1.add("hello1");
		arr1.add("hello2");
		arr1.add("hello3");
		arr1.add("hello4");
		arr1.add("hello5");
		
		for (String i : arr1) {
			System.out.println(i);
		}
		
		System.out.println();
		
		Set<String> arr2 = new TreeSet<String>();
		System.out.println("In TreeSet, order of sequesnce matters and dupplictes are not allowed");
		arr2.add("hello1");
		arr2.add("hello2");
		arr2.add("hello3");
		arr2.add("hello4");
		arr2.add("hello5");
		arr2.add("hello1");
		arr2.add("hello2");
		arr2.add("hello3");
		arr2.add("hello4");
		arr2.add("hello5");
		
		for (String i : arr1) {
			System.out.println(i);
		}
		
		
		
		
		System.out.println("\n--------------------------------------------------\n");
		
		
		
		
		List<Integer> arr3 = List.of(45,72,96,3,77,16);
//		arr3.add(99);   you can't do that as it is a immutable collection
		List<String> arr4 = List.of("df","dfds","fgfe","gdf","ewfdew");
//		arr4.add("AYUSh");   you can't do that as it is a immutable collection
		System.out.println(arr3);
		System.out.println(arr4);
		
	}
}
