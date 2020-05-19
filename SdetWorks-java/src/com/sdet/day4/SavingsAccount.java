package com.sdet.day4;

public class SavingsAccount extends Account{

	private double pension; 
	
	public SavingsAccount(int accNo, double roi, String custName, 
			double balance, double pension) {
		
		super(accNo, roi, custName, balance);
		
		this.pension = pension; 
	}

	public double getPension() {
		return pension;
	}

	@Override
	public void debitAmount(double amount) {
		if(amount >750){
			System.out.println("Sorry transaction cannot be over $750");
		}else{
			super.debitAmount(amount);
		}
	}

	
}
