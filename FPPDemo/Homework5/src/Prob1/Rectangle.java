package Prob1;

public class Rectangle extends Shape {

	protected double width;
	protected double length;

	public Rectangle(String color, double width, double length) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public double calcualteArea() {
		
		return width * length;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + length);
	}

}
