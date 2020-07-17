package com.sdet.day2;

public class Employee {
	
	// the java compiler will 
	// inject a default construtor
	// default contructor is the one
	// who does not accept any 
	// params 
	Employee(){}
	
	// instance variables
	// by declaring the varible's
	// as private, we are not allowing
	// to be access outside 
	private int empId; 
	private String empName; 
	private double empSal;
	private String empEmail; 
	
	// empid should not be -ve value 
	public void setEmpId(int id){
		this.empId = id; 
	}
	
	// name should not be less than 5 chars 
	public void setEmpName(String name){
		this.empName = name; 
	}
	
	public void setEmpSal(double empSal){
		if(empSal < 5000){
			System.out.println("Sorry Salary Cannot Be less than 5000");
			this.empSal = 5000;
		}else{
			this.empSal = empSal;
		}
	}
	
	// should have @ symbol 
	public void setEmpEmail(String empEmail){
		this.empEmail = empEmail;
	}
	
	public int getEmpId(){
		return this.empId; 
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public String getEmpEmail() {
		return empEmail;
	}
	
	
}











