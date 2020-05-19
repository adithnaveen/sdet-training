package com.sdet.day9;

// to show working of threads using Runnable Interface 

class Lamp{/* some business logic */ }

class NightLamp extends Lamp implements Runnable{
	
	private Thread thread; 
	private String name; 
	private int priority;
	
	public NightLamp(String name, int priority){
		this.name = name; 
		this.priority = priority; 
		
		
		thread  = new Thread(this);
		thread.setName(name);
		thread.setPriority(priority);
		
		// once you call start method, then the OS level thread is 
		// create then the control is given to run() methods 
		thread.start();
	}
	
	

	@Override
	public void run() {
		// we can put any business logic 
		
		for(int i=0; i<1000; i++){
		
		System.out.println("I value is " + i +", in the thread " 
				+ Thread.currentThread().getName() + 
				Thread.currentThread().getPriority());
		}
		System.out.println("Thread " + Thread.currentThread().getName() +" exiting");

	}
	
}

public class ThreadEx03 {
	public static void main(String[] args) {
		NightLamp nl1 = new NightLamp("Tripti", 5); 
		NightLamp nl2 = new NightLamp("Ravi", 4); 
		NightLamp nl3 = new NightLamp("Ashwini", 6); 
	}
}
