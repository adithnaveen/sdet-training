package com.sdet.day9;

class Account {
	private int money;

	Account(int amt) {
		// get amt from database
		money = amt;
	}

	synchronized void  withdraw(int amt) {
		// required amount is less than money(balance) 
		// 500 < 1000
		if (amt < money) {
			// Simulating to hit to db and 
			// deducting the balance 
			try {
				Thread.sleep(1000);
				money = money - amt;
			} catch (Exception e) {
			}
			System.out.println("Received " + amt + " by " + Thread.currentThread().getName());
		} else
			System.out.println(
					"Sorry " + Thread.currentThread().getName() + "Requested amt ("
							+ amt + ") is not available.");
		
		
		System.out.println("Balance " + money);
	}
}