package com.designpattern.structural.test;

import org.junit.Test;

import com.designpattern.structural.decorator.Beverage;
import com.designpattern.structural.decorator.DarkRoast;
import com.designpattern.structural.decorator.Decaf;
import com.designpattern.structural.decorator.Espresso;
import com.designpattern.structural.decorator.HouseBlend;
import com.designpattern.structural.decorator.Milk;
import com.designpattern.structural.decorator.Mocha;
import com.designpattern.structural.decorator.Soy;
import com.designpattern.structural.decorator.Whip;

public class DecoratorTest {

	
	@Test
	public void decoratorTest() {
		
		
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		beverage2 = new Milk(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
 
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
		
		Beverage beverage4 = new Decaf();
		System.out.println(beverage4.getDescription() 
				+ " $" + beverage4.cost());
		
		
	}
}
