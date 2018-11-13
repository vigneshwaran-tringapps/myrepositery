package com.designpattern.behavioral.template;

public class Coffee extends CaffeineBeaverage {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("adding sugar and milk");
	}

}
