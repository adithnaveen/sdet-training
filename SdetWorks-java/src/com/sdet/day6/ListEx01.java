package com.sdet.day6;

import java.util.ArrayList;

// all datatypes are raw type 

public class ListEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		
		list.add(10);
		list.add("hello");
		list.add(true); 
		list.add(new Object());
		
		
		for(Object temp : list){
			System.out.println(temp);
		}
		
	}
}
