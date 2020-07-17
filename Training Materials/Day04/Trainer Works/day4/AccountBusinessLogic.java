package com.sdet.day4;

public class AccountBusinessLogic {
	// here we will get savings or current 
	public void showAccount(Account account){
		System.out.println("===========================================");
		System.out.println(account);
		
		if(account instanceof SavingsAccount){
			System.out.println("Pension is " + 
				((SavingsAccount)account).getPension());
		}else if(account instanceof CurrentAccount){
			System.out.println("Over draft granted is " + 
					((CurrentAccount) account).getOverDraft());
		}
		
	}
	
	public void debitAmount(Account account, double amountToBeDebited){
		account.debitAmount(amountToBeDebited);
	}
	
	
}
