package com.sdet.day5;

public class Square extends Figure{
	private int len; 
	
	
	public Square(int len) {
		super();
		this.len = len;
	}


	@Override
	public void area() {
		System.out.println("Area of square " + 
				(len * len));
	}


	@Override
	public void draw() {
		System.out.println("Draing square with scale ");
	}
	
	
}	
