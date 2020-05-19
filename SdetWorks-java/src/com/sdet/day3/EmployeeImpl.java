package com.sdet.day3;

// to show working of GC 
public class EmployeeImpl {
	public static void main(String[] args) {
		
	// 	Runtime.runFinalizersOnExit(true);
		
		
		System.out.println("Total Memory " + Runtime.getRuntime().totalMemory());
		System.out.println("Free Memory " + Runtime.getRuntime().freeMemory());
		
		Employee emp = new Employee();
		

		System.out.println("emp id " + emp.getEmpId());
		System.out.println("emp Name " + emp.getEmpName());
		System.out.println("Emp Salary " + emp.getEmpSal());
		System.out.println("Emp Email  " + emp.getEmpEmail());
		
		Runtime.getRuntime().gc();
		
		System.out.println("Total Memory " + Runtime.getRuntime().totalMemory());
		System.out.println("Free Memory " + Runtime.getRuntime().freeMemory());
		
		System.out.println("After object is created... ");
	}
}
