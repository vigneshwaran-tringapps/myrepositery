package com.designpattern.behavioral.strategy;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehaviour = new Squeak();
	}

	@Override
	public void display() {
System.out.println("I'm Rubber Duck");
	}

}
