package com.sdet.day4;

public class CurrentAccount extends Account{

	private double overDraft; 
	
	public CurrentAccount(int accNo, double roi, 
			String custName, double balance, 
			double overDraft) {
		
		super(accNo, roi, custName, balance);

		this.overDraft = overDraft;
	}

	public double getOverDraft() {
		return overDraft;
	}
}
