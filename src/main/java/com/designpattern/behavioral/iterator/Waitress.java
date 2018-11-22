package com.designpattern.behavioral.iterator;


public class Waitress {

	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
	this.pancakeHouseMenu = pancakeHouseMenu;
	this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator panCakeIterator =pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("Menu\n-------\nBreakFasr");
		printMenu(panCakeIterator);
		System.out.println("\nlunch");
		printMenu(dinerIterator);

		
	}
	
	public void printMenu(Iterator  iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getDescription());
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getPrice());

			
		}
	}

}
