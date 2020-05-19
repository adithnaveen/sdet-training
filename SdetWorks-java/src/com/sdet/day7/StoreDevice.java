package com.sdet.day7;

import java.util.HashSet;

public class StoreDevice {
	public static void main(String[] args) {
		HashSet<Device> deviceSet = new HashSet<Device>(); 

		deviceSet.add(new Device(101, "Marker"));
		deviceSet.add(new Device(102, "Monitor"));
		deviceSet.add(new Device(103, "Memory Card"));
		deviceSet.add(new Device(104, "Mobile"));

		deviceSet.add(new Device(107, "Pen"));
		deviceSet.add(new Device(107, "Pen"));
		deviceSet.add(new Device(107, "Pen"));
		deviceSet.add(new Device(107, "Pen"));
		
		
		for(Device temp : deviceSet){
			System.out.println(temp +", Hashcode -> " + temp.hashCode() );
		}
		
		
	}
}
