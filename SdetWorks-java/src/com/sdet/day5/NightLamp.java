package com.sdet.day5;

public class NightLamp extends Lamp implements Device{

	@Override
	public void on() {
		System.out.println("Night Lamp turned On");
	}

	@Override
	public void off() {
		System.out.println("Night lamp turned off");
	}
	
}
