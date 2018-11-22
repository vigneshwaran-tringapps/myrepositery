package com.designpattern.behavioral.test;


import org.junit.Test;

import com.designpattern.behavioral.iterator.DinerMenu;
import com.designpattern.behavioral.iterator.PancakeHouseMenu;
import com.designpattern.behavioral.iterator.Waitress;

public class IteratorPatternTest {
	
	@Test
	public void test1() {
		
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
		waitress.printMenu();
	}
	

}
