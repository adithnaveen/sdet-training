package com.sdet.day5;

public class RemotControl {
	
	public static void onDevice(Device [] devices){
		for(int i=0; i<devices.length; i++){
			devices[i].on(); 
		}
	}
	
	public static void offDevice(Device [] devices){
		for(Device temp : devices){
			temp.off(); 
		}
	}
}
