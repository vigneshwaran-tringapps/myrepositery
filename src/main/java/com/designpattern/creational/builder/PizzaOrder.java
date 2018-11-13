package com.designpattern.creational.builder;

public class PizzaOrder {
	
	private PizzaBuilder builder;

	public void setPizzaBuilder(PizzaBuilder builder) {
		this.builder = builder;
	}

	public void preparePizza() {
		builder.createNewPizzaProduct();
		builder.buildDough();
		builder.buildSauce();
		builder.buildTopping();
	}

	public Pizza getPizza() {
		// TODO Auto-generated method stub
		return builder.getPizza();
	}
	
	

}
