package com.sdet.day9; 


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.ls.LSInput;

public class Assignment01 {
	public static void main(String[] args) {
		HashMap<String, List<String>> map = new 
					HashMap<String, List<String>>();
		
		List<String> helloMeaning = new ArrayList<String>(); 
		helloMeaning.add("Hello");
		helloMeaning.add("Namaste");
		helloMeaning.add("Bonjour");
		helloMeaning.add("Hallo");
		
		List<String> byeMeaning = new ArrayList<String>();
		byeMeaning.add("Bye");
		byeMeaning.add("Namste");
		byeMeaning.add("Tschüss");
		byeMeaning.add("au revoir");
		

		map.put("hello", helloMeaning); 
		map.put("bye", byeMeaning); 
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter a work to find synonym");
		String word = scanner.nextLine(); 
		
		List<String> temp = map.get(word); 
		
		if(temp!= null){
			System.out.println(temp);
		}else{
			System.out.println("Sorry No Synonym found for Word " + word);
		}
	}
}
