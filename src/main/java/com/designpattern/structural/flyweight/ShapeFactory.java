package com.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	
	static Map  circleMap = new HashMap();

	public static Shape create(String color) {
		 Shape circle = (Shape)circleMap.get(color);

	      if(circle == null) {
	         circle = new Circle(color);
	         circleMap.put(color, circle);
	         System.out.println("Creating circle of color : " + color);
	      }
	      return circle;
	}

}
