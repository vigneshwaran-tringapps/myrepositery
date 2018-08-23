package com.designpattern.creational.abstractFactory;

import com.designpattern.creational.abstractFactory.Cheese;
import com.designpattern.creational.abstractFactory.Clams;
import com.designpattern.creational.abstractFactory.Dough;
import com.designpattern.creational.abstractFactory.Pepperoni;
import com.designpattern.creational.abstractFactory.Sauce;
import com.designpattern.creational.abstractFactory.Veggies;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
