package com.sdet.day8;

class BankingBusinessLogic extends Thread{

	@Override
	public void run() {
		// simulating for a db 
		for(int i=0; i<1000; i++){
			System.out.println("I value is " + i +", in the thread " 
					+ Thread.currentThread().getName() +", with priority " + 
						Thread.currentThread().getPriority());
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

		System.out.println("Exiting Thread " + 
				Thread.currentThread().getName());
	}
}

public class ThreadEx02 {

	public static void main(String[] args) {
		
		BankingBusinessLogic bbl = new BankingBusinessLogic();
		bbl.setName("Michael");
		bbl.start(); 
		
		BankingBusinessLogic bbl2 = new BankingBusinessLogic(); 
		bbl2.setName("Ashwini");
		// will invoke java, invokes OS to create a thread. and gives control 
		// to run method in the class 
		bbl2.start(); 
		
		for(int i=0; i<1000; i++){
			System.out.println("I value is " + i +", in the thread " 
					+ Thread.currentThread().getName() + 
					Thread.currentThread().getPriority());

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		try {
			bbl.join();
			bbl2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Exiting Main Thread... ");
	}
}
