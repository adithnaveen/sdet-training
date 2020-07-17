package com.sdet.day8;


// the main method is the thread 
public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println("Current Thread Name " + Thread.currentThread().getName());
	
//		 1 min , 5 Norm, 10 max 
		System.out.println("Priority " + Thread.currentThread().getPriority());
	}
}
