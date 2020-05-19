package com.sdet.jdbc.beans;

public class Customer {
	private int custId; 
	private String custName; 
	private String custEmail; 
	private double custSalary;
	

	public Customer(){}
	
	
	public Customer(int custId, String custName, String custEmail, double custSalary) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custSalary = custSalary;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + ", custSalary="
				+ custSalary + "]";
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public double getCustSalary() {
		return custSalary;
	}
	public void setCustSalary(double custSalary) {
		this.custSalary = custSalary;
	} 
	
	
	
}
