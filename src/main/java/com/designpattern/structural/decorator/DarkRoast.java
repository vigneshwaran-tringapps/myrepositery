package com.designpattern.structural.decorator;

import com.designpattern.structural.decorator.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}
