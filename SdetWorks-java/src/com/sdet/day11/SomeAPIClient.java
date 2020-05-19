package com.sdet.day11;

public class SomeAPIClient {
	public static void main(String[] args) {
		try {
			Class.forName("com.sdet.day11.SomeAPI");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
