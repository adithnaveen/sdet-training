package com.sdet.day2;


// this class is a bean class 
public class Employee {
	
	// the java compiler will 
	// inject a default constructor
	// default constructor is the one
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
		if(id < 0 ){
			System.out.println("Sorry Employee id cannot be less than 100");
			this.empId = 100; 
			return ; 
		}
		this.empId = id; 
	}
	
	// name should not be less than 5 chars 
	public void setEmpName(String name){
		if(name.length()<5){
			System.out.println("Sorry invalid Name ");
			this.empName = "No Name";
			return ;
		}
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
		
		/*if(!empEmail.contains("@")){
			System.out.println("Sorry invalid Email, ex: hello@example.com");
			this.empEmail = "hello@example.com";
			return ;
		}*/
		
		if(empEmail.indexOf("@")>0){
			this.empEmail = empEmail;
		}else{
			System.out.println("Sorry invalid Email, ex: hello@example.com");
			this.empEmail = "hello@example.com";
		}
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











