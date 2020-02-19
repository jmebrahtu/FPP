package pro1;

import java.awt.List;
import java.util.ArrayList;

public class Circle extends Shape {
	double radius;

	Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
 Integer[] intArray= new Integer[10];
 Number[]numberArray= intArray;
 //List<Integer>intlist= new ArrayList<Integer>();
 
//  List<Number>numberlist= intlist;//invalid
 
// calculate area of a circle

	public double calcualteArea() {
		return Math.PI * radius * radius;
	}

	// Calculate circumference of a circle
	public double calculatePerimeter() {

		return (2 * Math.PI * radius);
	}
}
