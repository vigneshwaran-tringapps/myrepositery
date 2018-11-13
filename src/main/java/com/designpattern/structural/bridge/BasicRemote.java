package com.designpattern.structural.bridge;

public class BasicRemote implements Remote {

	protected Device device;

	protected BasicRemote() {

	}

	public BasicRemote(Device tv) {
		device = tv;
	}

	public void power() {

		if (device.isEnabled())
			device.disable();
		else
			device.enable();

	}

	public void volumeUp() {
		device.setvolume(device.getVolume() + 10);
	}

	public void volumeDown() {
		device.setvolume(device.getVolume() - 10);

	}

	public void channelUp() {
		device.setChannel(device.getChannel() + 1);
	}

	public void channelDown() {
		device.setChannel(device.getChannel() - 1);

	}

}
