package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionMethods {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("abc");
		arr.add("def");
		arr.add("ghi");
		arr.add("ijk");
		arr.add("lmn");
		System.out.println(arr);
//1.		System.out.println(arr);
		
		List<String> arr1 = new ArrayList<String>();
		arr1.add("fdg");
		arr1.add("hk");
		arr1.add("tew");
		arr1.add("rz");
		arr1.add("mdkj");
		System.out.println(arr1);
		
		List<String> arr2 = new ArrayList<String>();
		arr2.add("abc");
		arr2.add("def");
		arr2.add("ghi");
		arr2.add("ijk");
		arr2.add("lmn");
		System.out.println(arr2);
		
//2.		arr.addAll(arr1);
//		System.out.println(arr1);
//		System.out.println(arr);
		
		arr.remove(4);
//		System.out.println(arr);
		
//4.		arr.add(4, "FFFFF");
//		System.out.println(arr);
		
//5.		arr.clear();
//		System.out.println(arr);
		
//6.		System.out.println(arr.contains("ghi")); -->if contains a particular element from a list
		
//7.		System.out.println(arr.containsAll(arr1));  -->if contains all the elements from the other collection
		
//8.		 System.out.println(arr.equals(arr2)); -->true
		
//9.		System.out.println(arr.get(4));
		
//10.		System.out.println(arr.indexOf("def"));
		
//11.		System.out.println(arr.isEmpty());
		
		Iterator<String> i = arr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
