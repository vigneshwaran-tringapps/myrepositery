package com.designpattern.behavioral.strategy;

public class DuckSimulator {

	public static void main(String[] args) {

		Duck duck = new MallardDuck();
		
		duck.performFly();
		duck.performQuack();
	}

}
