package pro1;

public class Rectangle extends Shape {
	double width;
	double length;

	Rectangle(String colour, double width, double length) {
		super(colour);
		this.width = width;
		this.length = length;

	}

	@Override
	//calculate area of a rectangle
	double calculateArea() {

		return width * length;

	}

	@Override
	//calculate Perimeter of a rectangle
	 public double calculatePerimeter() {

		return (2 * width + 2 * length);

	}

	@Override
	public String toString() {

		return colour + " " + width + " " + length;
	}

}
