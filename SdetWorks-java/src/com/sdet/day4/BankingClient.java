package com.sdet.day4;

public class BankingClient {
	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount(101, 3.5, "Laxmi", 7000, 350); 

		System.out.println(sa);
		System.out.println("Pension Amount : " +sa.getPension());
		sa.debitAmount(5000);
		System.out.println(sa);
		
		System.out.println("------------------------------------------");
		CurrentAccount ca = new CurrentAccount(201, 4.8, "Ashwini", 
				4000, 25000); 
		
		System.out.println(ca);
		System.out.println("Over Draft amount " + ca.getOverDraft());
		
	}
}
