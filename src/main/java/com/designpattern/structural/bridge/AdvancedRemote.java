package com.designpattern.structural.bridge;

public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(Device tv) {
		super(tv);
	}

	public void mute() {
		super.device.setvolume(0);
	}
}
