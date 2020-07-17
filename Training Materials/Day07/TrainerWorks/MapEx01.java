package com.sdet.day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		
		map.put("mobile", 10); 
		map.put("marker", 20); 
		map.put("pen", 445); 
		map.put("monitor", 3); 
		map.put("laptop", 1); 
		
		Set set = map.entrySet(); 
		Iterator itr = set.iterator(); 
		
		while(itr.hasNext()){
			Map.Entry<String, Integer> temp = (Entry<String, Integer>) itr.next(); 
			System.out.println("Key " + temp.getKey() + ", Value " + temp.getValue());
		}
	}

	private static void show(HashMap<String, Integer> map) {
		System.out.println("Number of Mobiles in Cart " + map.get("mobile"));
		
		map.put("mobile", 12); 

		System.out.println("Number of Mobiles in Cart " + map.get("mobile"));
		System.out.println("Number of Marker in Cart "  + map.get("marker"));
	}
}
