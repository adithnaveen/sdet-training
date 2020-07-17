package com.sdet.day4;

public class Account {
	private int accNo; 
	private double roi; 
	private String custName; 
	private double balance; 
	
	// BL 
	public void debitAmount(double amount){
		if(balance>amount){
			System.out.println("Transaction - Debit of Amount " + amount + 
						" Successful ");
			balance  = balance - amount; 
		}else{
			System.out.println("Sorry no balance amount not debited " + amount);
		}
	}
	
	public void creditAmount(double amount){
		balance = balance + amount; 
	}

	public Account(int accNo, double roi, String custName, 
			double balance) {
		super();
		this.accNo = accNo;
		this.roi = roi;
		this.custName = custName;
		this.balance = balance;
	}

	public double getRoi() {
		return roi;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getCustName() {
		return custName;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", roi=" + roi + ", custName=" + custName + ", balance=" + balance + "]";
	}
	
	
	
}
