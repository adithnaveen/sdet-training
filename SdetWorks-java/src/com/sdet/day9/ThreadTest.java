package com.sdet.day9;

public class ThreadTest implements Runnable {
	Account a;
	int amt;

	public static void main(String str[]) {
		Account lb = new Account(1000);
		// they get executed in Async 
		new ThreadTest(lb, "A", 500);
		new ThreadTest(lb, "B", 750);
	}

	public ThreadTest(Account a, String name, int amt) {
		this.a = a;
		this.amt = amt;
		// the thread is created and control is given to run method 
		new Thread(this, name).start();
	}

	public void run() {
		
			a.withdraw(amt);
		
	}
}