package com.designpattern.creational.prototype;

import java.util.Objects;

public abstract class Shape {
	
	public int x;
	public int y;
	public String color; 
	
	
	public Shape() {
		
	}
	
	public Shape(Shape shape) {
		this.x = shape.x;
		this.y = shape.y;
		this.color = shape.color;

	}
	
	public abstract Shape clone();
	
	
	public boolean equals(Object object) {

		if (!(object instanceof Shape))
			return false;

		Shape shape = (Shape) object;

		return shape.x == this.x && shape.y == this.y && Objects.equals(shape.color, color);
	}
	

}
