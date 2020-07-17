package com.sdet.day6;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		
		System.out.println("Size of List before adding " + list.size());
		
		
		list.add("Ashwini"); 
		list.add("Adithya"); 
		list.add("Laxmi"); 
		list.add("Ravi"); 
		list.add("Siby"); 
		list.add("Siby"); 
		list.add("Siby"); 
		list.add("Siby"); 
		
		// display(list);
		// display1(list);
		// display2(list);

		System.out.println(list);
		
		System.out.println("Size of list at last " + list.size());
		
		System.out.println("Element @0 " + list.get(0));
		
		list.remove(0); 
		System.out.println(list);

		System.out.println("Size of list at last " + list.size());

		list.clear(); 
		System.out.println(list);
		
	}

	private static void display2(ArrayList<String> list) {
		for(String temp : list){
			System.out.println(temp);
		}
	}

	private static void display1(ArrayList<String> list) {
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}

	private static void display(ArrayList<String> list) {
		Iterator<String> itr = list.iterator(); 
		
		while(itr.hasNext()){
			String temp = itr.next(); 
			System.out.println(temp);
		}
	}
}
