package com.designpattern.creational.prototype;

public class Circle extends Shape {
	
	public int radius;
	
	public Circle() {
		
	}
	
	public Circle(Circle target) {
		super(target);
        if (target != null) {
            this.radius = target.radius;
        }
	}
	
	

	@Override
	public Shape clone() {
		// TODO Auto-generated method stub
		return new Circle(this);
	}
	
	public boolean equals(Object object) {

		if (!(object instanceof Circle) || !(super.equals(object)))
			return false;

		Circle circle = (Circle) object;
		return this.radius == circle.radius;
	}

}
