package com.designpattern.structural.bridge;

public interface Device {
	
	public boolean isEnabled();
	
	public void enable();
	
	public void disable();
	
	public int getVolume();
	
	public void setvolume(int volume);
	
	public int getChannel();
	
	public void setChannel(int channel);
	
	public void printStatus();
	

}
