package com.sdet.day11;

public class Sample {
	public boolean sayOk() {
		return true;
	}

	public String sayHello(String name) {
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Hello " + name; 
	}
	
	public int addNumbers(int num1, int num2){
		return num1 + num2; 
	}
}
