package com.designpattern.behavioral.template;

public abstract class CaffeineBeaverage {

	public final void prepareRecipe() {

		boilWater();
		brew();
		pourInCup();
		addCondiments();

	}

	

	abstract void brew();

	abstract void addCondiments();

	private void boilWater() {

		System.out.println("Boiling Water");
	}
	private void pourInCup() {
		System.out.println("pouring into cup");
	}
}
