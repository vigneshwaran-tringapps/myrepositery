package com.designpattern.creational.prototype;

public class Rectangle extends Shape {
	
	public int width;
	public int height;

	
	public Rectangle() {
		
	}
	
	public  Rectangle(Rectangle target) {
		super(target);
		
		if(target != null) {
			this.height = target.height;
			this.width = target.width;
		}
		
	}
	@Override
	public Shape clone() {
		
		return new Rectangle(this);
	}
	
	
	public boolean equals(Object object) {

		if (!(object instanceof Rectangle) || !(object instanceof Shape))
			return false;

		Rectangle rectangle = (Rectangle) object;

		return rectangle.height == this.height && rectangle.width == this.width;

	}

}
