package com.sdet.day6;

import java.util.Arrays;

public class SortPrimitive {
	public static void main(String[] args) {
		int nums[] = {43, 34, 23, 4, 66, 78, 2,50}; 
		
		
		for(int i : nums){
			System.out.println(i);
		}
		
		System.out.println("-------------After Sort ------------------");
		
		Arrays.sort(nums);
		
		for(int i : nums){
			System.out.println(i);
		}
		
	}
}
