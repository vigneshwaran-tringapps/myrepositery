package com.designpattern.behavioral.iterator;

public class PancakeHouseMenu implements Menu {
	MenuItem[] menuItems;
	int numberOfitems =0;
	static final int MAX_ITEMS = 6;
	
	public PancakeHouseMenu() {
		
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("K&B's Pancake Breakfast", 
				"Pancakes with scrambled eggs, and toast", 
				true,
				2.99);
	 
			addItem("Regular Pancake Breakfast", 
				"Pancakes with fried eggs, sausage", 
				false,
				2.99);
	 
			addItem("Blueberry Pancakes",
				"Pancakes made with fresh blueberries, and blueberry syrup",
				true,
				3.49);
	 
			addItem("Waffles",
				"Waffles, with your choice of blueberries or strawberries",
				true,
				3.59);
	}

	public Iterator createIterator() {

		return new PanCakeIterator(menuItems) ;
	}

	@Override
	public void addItem(String name, String description, boolean vegetarian, double price) {
		
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		
		if(numberOfitems >= MAX_ITEMS)
			System.out.println("menu is full, cant add item in menu");
		else
			menuItems[numberOfitems++]=item;
	}

}
