package com.designpattern.structural.test;

import org.junit.Test;

import com.designpattern.structural.adapter.Duck;
import com.designpattern.structural.adapter.MallardDuck;
import com.designpattern.structural.adapter.TurkeyAdapter;
import com.designpattern.structural.adapter.WildTurkey;

public class AdapterPatternTest {
	
	@Test
	public void test() {
	
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println("the turkey says ............");
		
		turkey.gobble();
		turkey.fly();
		
		System.out.println("the duck says ............");
		
		testDuck(duck);
		
		System.out.println("the turkeyAdapter says ............");

		testDuck(turkeyAdapter);
		
		
		
		
	}

	private void testDuck(Duck duck) {
		duck.fly();
		duck.quack();
		
	}

}
