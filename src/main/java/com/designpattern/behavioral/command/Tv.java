package com.designpattern.behavioral.command;

public class Tv {
	
	public void onTV() {
		System.out.println(" tv turned on");
	}
	
	public void offTV() {
		System.out.println(" tv turned off");
	}

	public void changeChannel() {
		System.out.println(" switched to another channel");
		
	}

}
