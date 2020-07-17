package com.sdet.day6;

import java.util.Arrays;

public class ClientSort {
	public static void main(String[] args) {
		Employee [] emps = new Employee[]{
				new Employee(123, "Tripti", 5555), 
				new Employee(23, "Kamy", 5678), 
				new Employee(55, "Krishna", 4567), 
				new Employee(12, "Ravi", 8765), 
		};
		
		for(Employee temp : emps){
			System.out.println(temp);
		}
		
		System.out.println("------------ After Sort------------");
		
		Arrays.sort(emps);
		
		for(Employee temp : emps){
			System.out.println(temp);
		}
	}
}
