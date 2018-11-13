package com.designpattern.behavioral.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.designpattern.behavioral.template.Coffee;
import com.designpattern.behavioral.template.Tea;

public class TemplateMethodTest {
	
	Tea tea;

	Coffee coffee;
	
	@Before
	public void testbefore() {
		
		tea = new Tea();
		coffee = new Coffee();

	}
	
	@Test
	public void test() {

		tea.prepareRecipe();

		coffee.prepareRecipe();

	}
	

	@After
	public void testAfter() {
		
		System.out.println("vignesh done this");
		
	}

}
