package com.designpattern.structural.test;

import org.junit.Test;

import com.designpattern.structural.flyweight.Circle;
import com.designpattern.structural.flyweight.Shape;
import com.designpattern.structural.flyweight.ShapeFactory;
import com.designpattern.structural.flyweight.ShapeofColor;

public class FlyweightPatternTest {
	

@Test
public void test1() {
	ShapeofColor shapecolor = new ShapeofColor();
	for (int i = 0; i < 20; i++) {
		Circle circle = (Circle)ShapeFactory.create(shapecolor.getColor());
		 circle.setX(shapecolor.getRandomX());
         circle.setX(shapecolor.getRandomY());
         circle.setRadius(100);
         circle.draw();	}
}
}
