package com.sdet.day8;

// this class shall be eligible to have throw 
// and this is part of checked exception i.e., 
// you have to surround it with try-catch block 
// or if you are using throws clause then the 
// the caller has to surround with try-catch 

public class MyCompanyException extends Exception{

	private String message; 
	
	public MyCompanyException(){
		this.message ="MyCopmany Default Exception called"; 
	}
	
	public MyCompanyException(String message){
		this.message = message; 
	}

	@Override
	public String getMessage() {
		return this.message; 
	}

	@Override
	public String toString() {

		return "[ "+this.message +" ]"; 
	}

	

}


