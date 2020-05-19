package com.sdet.day5;

public class Rectangle extends Figure{
	
	private int len; 
	private int bre; 
	
	
	
	public Rectangle(int len, int bre) {
		super();
		this.len = len;
		this.bre = bre;
	}

	public void area(){
		System.out.println("Area of rectangle is " + 
				(len * bre));
	}

	@Override
	public void draw() {
		System.out.println("Draing rectangle with pencil and scale");
	}

}
