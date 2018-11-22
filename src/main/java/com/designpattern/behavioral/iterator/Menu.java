package com.designpattern.behavioral.iterator;

public interface Menu {

	public Iterator createIterator();
	void addItem(String name, String description, boolean vegetarian, double price);
}
