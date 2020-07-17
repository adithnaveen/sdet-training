package com.sdet.day5;

public class Lamp implements Device{

	@Override
	public void on() {
		System.out.println("Lamp is turned on ");
	}

	@Override
	public void off() {
		System.out.println("lamp is turned off");
	}

}
