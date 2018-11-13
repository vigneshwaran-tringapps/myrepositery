package com.designpattern.structural.flyweight;

public class ShapeofColor {
	
	   private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public int getRandomX() {
		// TODO Auto-generated method stub
		return (int) (Math.random()*100);
	}

	public int getRandomY() {

		return (int) (Math.random()*100);
	}

	public String getColor() {
		// TODO Auto-generated method stub
		return colors[(int) (Math.random()*colors.length)];
	}

}
