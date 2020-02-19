package lesson3;

final class Rectangle {



	private double length;
	private double width;
	private double area;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		this.rectangleleArea(length, width);
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	private void rectangleleArea(double length, double width) {
		area = length * width;
		System.out.println("Area of the rectangle is : " + area);

	}

}
