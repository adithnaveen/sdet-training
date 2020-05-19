package com.sdet.day5;

public class DevicesClient {
	public static void main(String[] args) {
		Device [] devices = new Device[5]; 
		
		devices[0] = new AC(); 
		devices[1] = new Lamp();
		devices[2] = new AC(); 
		devices[3] = new NightLamp() ;
		devices[4] = new Lamp();
		
		RemotControl.onDevice(devices);
		
		System.out.println("------------------------");
		
		RemotControl.offDevice(devices);
		
	}
}
