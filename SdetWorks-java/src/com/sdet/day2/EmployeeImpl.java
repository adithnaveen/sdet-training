package com.sdet.day2;

public class EmployeeImpl {
	public static void main(String args[]){
		Employee emp=null; 
		emp = new Employee();
		
		emp.setEmpId(101);
		emp.setEmpName("Gopi");
		emp.setEmpSal(400);
		emp.setEmpEmail("gopi@gmail.com");
		
		
		System.out.println("Emp Id : "+ emp.getEmpId());
		System.out.println("Emp Name " + emp.getEmpName());
		System.out.println("Emp Salary " + emp.getEmpSal());
		System.out.println("Emp Emial " + emp.getEmpEmail());
	}
}
