package com.designpattern.structural.decorator;

public class Decaf extends Beverage {
	
	public Decaf() {
		description = "Decaf Coffee";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}

}
