package com.designpattern.structural.decorator;

import com.designpattern.structural.decorator.Beverage;
import com.designpattern.structural.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	 
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
