package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStream {
	
	//Stream and anonymous function comes after java 1.8
	public static void main(String[] args) {
		
		//create a list and filter it
		List<Integer> list1 = List.of(23,56,6,32,87,3);
		List<String> list2 = List.of("Arvind", "Arun", "Dharmesh", "Ron", "amit");
		
//		List<Integer> l2 = new ArrayList<Integer>();
//		l2.add(13);
//		l2.add(6);
//		l2.add(27);
//		l2.add(56);
//		l2.add(4);
		
//		List<Integer> l3 = Arrays.asList(75,92,45,62,3,12,9);
		
		//boiler plate code
//		List<Integer> listEven = new ArrayList<Integer>();
//		for(int i : list1) {
//			if(i%2==0) {
//				listEven.add(i);
//			}
//		}
//		System.out.println("New List(evenList): "+listEven);
		
		Stream<Integer> s1 = list1.stream();
		List<Integer> l4 =  s1.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l4);
		
		Stream<String> s2 = list2.stream();
		List<String> l5 = s2.filter(i->i.startsWith("A")).collect(Collectors.toList());
		System.out.println(l5);
		
		
		
		
		
		System.out.println();
		
		
		
		
		Stream<Integer> s3 = list1.stream();
		List<Integer> l6 = s3.map(i->i*i).collect(Collectors.toList());
		System.out.println(l6);
		
		
		
		System.out.println();
		
		
		
		
		list1.stream().forEach(System.out::print);
		
		
		
		/*
		
		 Stream can't be modified. You can't add or remove from the stream.
		 
		 */
	}
}