package com.sdet.day6;

import java.util.HashSet;

public class SetEx01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>(); 
		
		set.add("Pen"); 
		set.add("Pencil"); 
		set.add("Mobile"); 
		set.add("Laptop"); 
		set.add("Monitor"); 	
		set.add("Monitor"); 
		set.add("Monitor"); 	
		set.add("Monitor"); 
		set.add("Monitor"); 	
		set.add("Monitor"); 
		set.add("Monitor"); 	
		set.add("Monitor"); 
		set.add("Monitor"); 	
		set.add("Monitor"); 
		
		System.out.println(set);
		System.out.println("Size after adding " + set.size());
		
		set.remove("Pen"); 
		System.out.println(set);
		
	}
}
