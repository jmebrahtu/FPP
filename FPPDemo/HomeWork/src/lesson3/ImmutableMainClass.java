package lesson3;
import java.util.Scanner;
 final class ImmutableMainClass {

	
		private static double height;
		private static double base;
		private static double length;
		private static double width;
		private static double radius;

		public static void main(String[] args) {
			// calling switch class to make figures selection
			SwitchClass.choices();
			System.out.println("Good bye!!!");
		}
		

		public static void triangle() {
			// reading height of triangle
			System.out.println("Enter height of the triangle ");
			Scanner h = new Scanner(System.in);
			height = h.nextDouble();

			// reading base of the triangle
			System.out.println("Enter base of the triangle ");
			Scanner b = new Scanner(System.in);
			base = b.nextDouble();

			// Invoking the triangle class to calculate area of the triangle
			new Triangle(height, base);
		}

		public static void rectangle() {
			// reading length of rectangle
			System.out.println("Enter length of rectangle ");
			Scanner l = new Scanner(System.in);
			length = l.nextDouble();

			// reading with of the rectangle
			System.out.println("Enter with of the rectangle ");
			Scanner w = new Scanner(System.in);
			width = w.nextDouble();

			// Invoking the triangle class to calculate area of the triangle
			new Rectangle(length, width);
		}
		public static void circle() {
			// reading radius of circle
			System.out.println("Enter radius of circle ");
			Scanner r = new Scanner(System.in);
			radius = r.nextDouble();

			

			// Invoking the triangle class to calculate area of the triangle
			new Circle(radius);
		}

	

	}


