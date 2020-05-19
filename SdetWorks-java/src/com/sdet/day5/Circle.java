package com.sdet.day5;

public class Circle extends Figure{
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
//		System.out.println("Area of Circle (PI * R * R)" +
//				Math.round((3.14 * radius * radius)));
		
		System.out.printf("Area of Circle (PI * R * R) %.2f\n",
				(3.14 * radius * radius));
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle with pencil and compass");
	} 
}
