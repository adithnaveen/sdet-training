package com.sdet.day4;

public class BankingClient3 {
	public static void main(String[] args) {
		Account accounts[] = new Account[5]; 
		AccountBusinessLogic abl = new AccountBusinessLogic(); 
		
		accounts[0] = new SavingsAccount(102, 4.5, "Kamy", 7000, 780); 
		accounts[1] = new SavingsAccount(103, 4.5, "Ashwini", 8000, 666); 
		accounts[2] = new CurrentAccount(201, 5.6, "Siby", 8000, 30000); 
		accounts[3] = new SavingsAccount(105, 4.5, "Michael", 7800, 555); 
		accounts[4] = new CurrentAccount(202, 5.6, "Tripti", 8500, 34000);  
		
		
		for(int i=0; i<accounts.length; i++){
			abl.showAccount(accounts[i]);
		}
	}
}
