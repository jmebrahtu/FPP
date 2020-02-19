package Prob1;

public class Main {

	public static void main(String[] args) {
		

		Shape[] shapes = new Shape[6];
		
		Rectangle purpleRectangle = new Rectangle("Purple", 6, 4);
		shapes[0] = purpleRectangle;
		
		Rectangle redRectangle = new Rectangle("Red", 7, 5);
		shapes[1] = redRectangle;
		
		Circle whiteCircle = new Circle("White", 4);
		shapes[2] = whiteCircle;
		
		Circle blueCircle = new Circle("Blue", 5);
		shapes[3] = blueCircle;
		
		Square greenSquare = new Square("Green", 8);
		shapes[4] = greenSquare;
		
		Square greySquare = new Square("Grey", 4);
		shapes[5] = greySquare;
		
		printTotal(shapes);
	}
	
	public static void printTotal(Shape[] shapes){
		double totalArea = 0, totalPerimeter = 0;
		for(Shape s: shapes) {
			totalArea += s.calcualteArea();
			totalPerimeter += s.calculatePerimeter();
		}
		System.out.println("Total Area of all the Shapes     : "+totalArea);
		System.out.println("Total Perimeter of all the Shapes: "+totalPerimeter);
	}

}
