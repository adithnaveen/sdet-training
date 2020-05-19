package com.sdet.day2;

public class EvenOdd {
	public static void main(String []args){
		String input = args[0];
		
		// if you give the value as 10 
		// "hi" 
		int num =  Integer.parseInt(input);
		
		for(int i=0; i<num; i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		
	}
}
