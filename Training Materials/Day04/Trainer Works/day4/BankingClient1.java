package com.sdet.day4;

public class BankingClient1 {
	public static void main(String[] args) {
		Account account; 
		AccountBusinessLogic abl = new AccountBusinessLogic(); 
		
		account = new SavingsAccount(101, 3.5, "Krishna", 8000, 800); 
		abl.showAccount(account);
		
		System.out.println("----------------------------------------------");
		
		
		account = new CurrentAccount(20, 5.5, "Ravi", 12000, 45000); 
		abl.showAccount(account);

		

	}
}
