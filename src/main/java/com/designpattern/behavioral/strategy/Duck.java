package com.designpattern.behavioral.strategy;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehaviour quackBehaviour;

	public void swim() {
		System.out.println("all ducks swims");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	abstract public void display();

}
