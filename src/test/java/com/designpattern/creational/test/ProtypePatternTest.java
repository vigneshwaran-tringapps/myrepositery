package com.designpattern.creational.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.designpattern.creational.prototype.Circle;
import com.designpattern.creational.prototype.Rectangle;
import com.designpattern.creational.prototype.Shape;

public class ProtypePatternTest {
	
	@Test
	public void test1() {
		Circle circle = new Circle();
		
		Rectangle rectangle = new Rectangle();
		
		

        List<Shape> shapes = new ArrayList<Shape>();
        List<Shape> shapesCopy = new ArrayList<Shape>();

        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }

}
