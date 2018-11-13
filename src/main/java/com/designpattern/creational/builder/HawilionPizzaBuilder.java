package com.designpattern.creational.builder;

public class HawilionPizzaBuilder extends PizzaBuilder {

	 public void buildDough() {
	        pizza.setDough("cross");
	    }

	    public void buildSauce() {
	        pizza.setSauce("mild");
	    }

	    public void buildTopping() {
	        pizza.setTopping("ham+pineapple");
	    }

}
