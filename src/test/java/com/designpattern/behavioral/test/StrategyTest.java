package com.designpattern.behavioral.test;

import org.junit.Test;

import com.designpattern.behavioral.strategy.DecoyDuck;
import com.designpattern.behavioral.strategy.Duck;
import com.designpattern.behavioral.strategy.MallardDuck;
import com.designpattern.behavioral.strategy.RubberDuck;

public class StrategyTest {

	@Test
	public void test() {

		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();

		Duck decoyDuck = new DecoyDuck();

		decoyDuck.performFly();
		decoyDuck.performQuack();

		Duck rubberDuck = new RubberDuck();

		rubberDuck.performFly();
		rubberDuck.performQuack();

	}
}
