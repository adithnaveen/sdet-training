package com.sdet.day5;

public class AC implements Device{

	@Override
	public void on() {
		System.out.println("The AC is turned on ");
	}

	@Override
	public void off() {
		System.out.println("The AC is turned off");
	}

}
