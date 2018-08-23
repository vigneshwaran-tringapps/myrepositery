package com.designpattern.structural.decorator;

import com.designpattern.structural.decorator.Beverage;
import com.designpattern.structural.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
	
	Beverage beavarage;
	
	public Whip(Beverage  beavarage) {

		this.beavarage = beavarage;
	
	}
	

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beavarage.getDescription()+", whip ";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10+beavarage.cost();
	}

}
