package com.sdet.day6;

public class Employee implements Comparable<Employee>{
	private int empId; 
	private String empName; 
	private double empSal;
	
	
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	
	// the return value will be 1 or -1 or 0 
	@Override
	public int compareTo(Employee o) {
	
		// this will be in ascending order 
//		return this.empId - o.getEmpId();
// 		return o.getEmpId() - this.empId;
		
//		return this.empName.compareTo(o.getEmpName());
		return o.getEmpName().compareTo(this.getEmpName());
		
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	} 
	
	
}
