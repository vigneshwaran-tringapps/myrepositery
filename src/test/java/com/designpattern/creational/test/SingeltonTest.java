package com.designpattern.creational.test;

import org.junit.Test;

import com.designpattern.creational.singleton.Singleton;
import com.designpattern.creational.singleton.Boiler.ChocolateBoiler;

public class SingeltonTest {

	@Test
	public void test() {
	Singleton singleton = Singleton.getInstance();
	System.out.println(singleton.getDescription());
	}
	
	@Test
	public void boilerTest() {
		
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
	}
}
