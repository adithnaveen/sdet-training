package com.sdet.day3;

public class EmployeeImpl1 {
	public static void main(String[] args) {
		Employee emp = new Employee(101, "Harry", 10000, "harry@gmail.com"); 
		System.out.println(emp); // -> emp.toString();
	}
}
