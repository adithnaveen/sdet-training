package com.sdet.day5;

import com.sdet.day4.SataticExample;

public class SimpleMath {
	
	// static variable 
	static int x = 33; 
	
	// you dont have to create an instance of the 
	// class if the method is declared as static 
	// and all static methods in the world will be loaded before 
	// main method 

	// in addition you can also have static block 
	
	public static int add(int num1, int num2){
		return num1 + num2; 
	}
	
	// static blocks will not be able to invoke and they execute 
	// by them self (DB connections which you want to do it 
	// only once and before all, or opening the files )
	static{
		System.out.println("Hey i'm from first static block ");
	}

	// all static blocks will be executed in sequential order 
	// of there presence 
	static{
		System.out.println("Hey i'm from second static block ");
	}
	
	public static int sub(int num1, int num2){
		return num1 + num2; 
	}
	
	public static void main(String[] args) {
		System.out.println(add(33,55));
		
		SataticExample.exampleStatic();
	}
}







