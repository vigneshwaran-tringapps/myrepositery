package com.designpattern.behavioral.template;

public class Tea extends CaffeineBeaverage {

	@Override
	void brew() {
		System.out.println("steeping the tea");
	}

	@Override
	void addCondiments() {
		System.out.println("adding lemon");
	}

}
