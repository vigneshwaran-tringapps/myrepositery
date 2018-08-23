package com.designpattern.behavioral.strategy;

public class MallardDuck extends Duck {

	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehaviour = new Quack(); 
		
	}
	@Override
	public void display() {
System.out.println("I' mallard Duck");
	}

}
