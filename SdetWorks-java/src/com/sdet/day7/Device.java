package com.sdet.day7;

public class Device {
	private int deviceId;
	private String deviceName;

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", deviceName=" + deviceName + "]";
	}

	public Device(){}
	public Device(int deviceId, String deviceName) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
	}

	@Override
	public int hashCode() {
		return this.deviceName.charAt(0); 
	}

	@Override
	public boolean equals(Object obj) {
		Device temp = (Device) obj; 
		
		if(this.deviceId==temp.deviceId && this.deviceName.equals(temp.getDeviceName())){
			return true; 
		}else {
			return false; 
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
