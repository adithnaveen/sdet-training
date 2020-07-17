package com.sdet.day7;

public class ExceptionEx01 {
	public static void main(String[] args) {
		try{
			int num1 = Integer.parseInt(args[0]); 
			int num2 = Integer.parseInt(args[1]); 
			
			try{
				int arr[] = new int[-4];
			}catch(NegativeArraySizeException nas){
				System.out.println("Sorry Please dont initialize array with -ve values" + 
						nas);	
			}
			int res = num1 / num2; // java will invoke OS to stop(Abort) 
			System.out.println("Result " + res);
		}catch(ArithmeticException e){
			System.out.println(e);
		}catch(NumberFormatException nfe){
			System.out.println("----------------------------");
			System.out.println("Please pass only integers ");
			nfe.printStackTrace(); 
			System.out.println("----------------------------");
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("Sorry Please pass the valeus " + aiobe);
		}catch(Exception  e){
			System.out.println("Contact Admin with error message");
			e.printStackTrace();
		}finally{
			System.out.println("Hey i'm finally always here... ");
		}
		System.out.println("Other Business Logic Goes Here");
		
		
	}
}
