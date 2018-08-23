package com.designpattern.creational.abstractFactory;

import com.designpattern.creational.abstractFactory.Cheese;
import com.designpattern.creational.abstractFactory.Clams;
import com.designpattern.creational.abstractFactory.Dough;
import com.designpattern.creational.abstractFactory.Pepperoni;
import com.designpattern.creational.abstractFactory.Sauce;
import com.designpattern.creational.abstractFactory.ThinCrustDough;
import com.designpattern.creational.abstractFactory.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {


	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
