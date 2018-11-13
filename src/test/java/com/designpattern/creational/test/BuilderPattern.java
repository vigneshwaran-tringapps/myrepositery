package com.designpattern.creational.test;

import org.junit.Test;

import com.designpattern.creational.builder.HawilionPizzaBuilder;
import com.designpattern.creational.builder.Pizza;
import com.designpattern.creational.builder.PizzaBuilder;
import com.designpattern.creational.builder.PizzaOrder;
import com.designpattern.creational.builder.SpicyPizzaBuilder;

public class BuilderPattern {

	@Test
	public void test1() {

		PizzaBuilder hawilionBuilder = new HawilionPizzaBuilder();
		PizzaBuilder spicyBuilder = new SpicyPizzaBuilder();
		

		PizzaOrder pizzaOrder = new PizzaOrder();
		pizzaOrder.setPizzaBuilder(spicyBuilder);

		pizzaOrder.preparePizza();
		Pizza pizza = pizzaOrder.getPizza();

		System.out.println(pizza.getDough());
		System.out.println(pizza.getSauce());
		System.out.println(pizza.getTopping());

		System.out.println("------------------/n");

		pizzaOrder.setPizzaBuilder(hawilionBuilder);
//		pizzaOrder.preparePizza();
		pizza = pizzaOrder.getPizza();

		System.out.println(pizza.getDough());
		System.out.println(pizza.getSauce());
		System.out.println(pizza.getTopping());

	}

}
