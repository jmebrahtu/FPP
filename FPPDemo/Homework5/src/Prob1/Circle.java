package Prob1;

public class Circle extends Shape {

	protected double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double calcualteArea() {
		
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double calculatePerimeter() {
		
		return 2 * Math.PI * radius;
	}

}
