package com.sdet.day6;

import java.util.Vector;

public class ListEx03 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>(500, 45);
		
		System.out.println("Number of Elements " + list.size());
		System.out.println("The Capacity before adding " + list.capacity());
		
		list.add("Krishna");
		list.add("Laxmi"); 
		list.add("Aswhwini"); 
		list.add("Krishna");
		list.add("Laxmi"); 
		
		System.out.println(list);
		list.add("Aswhwini"); 
		list.add("Krishna");
		list.add("Laxmi"); 
		System.out.println(list);
		
		list.add("Aswhwini"); 
		list.add("Aswhwini"); 
		list.add("Aswhwini"); 
		
		list.add("Aswhwini"); 

		System.out.println(list);
		System.out.println("Number of Elements " + list.size());
		System.out.println("The Capacity after adding " + list.capacity());
		
		
	}
}
