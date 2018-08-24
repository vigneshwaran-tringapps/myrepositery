package com.designpattern.creational.singleton;

public class Singleton {

	private static Singleton uniqueInstance;
	
	public Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}		
		return uniqueInstance;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return "I m Singletons" ;
	}

}
