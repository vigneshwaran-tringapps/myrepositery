package com.designpattern.creational.test;

import org.junit.Test;

import com.designpattern.creational.factory.Pizza;
import com.designpattern.creational.factory.PizzaStore;
import com.designpattern.creational.factory.SimplePizzaFactory;

public class FactoryTest {
	
	
	@Test
	public void test() {
		

		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
		
	}

}
