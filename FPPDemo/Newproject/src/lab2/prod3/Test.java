package lab2.prod3;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		Polygon[] objects = { new Triangle(4, 5, 6), new Square(3), new Rectangle(3, 7) };
		for (Polygon poly : objects) {

			System.out.println(
					"For this " + poly.getClass().getSimpleName() + 
					"\n" + "numb of sides" +Arrays.toString(poly.getArrayOfSide())+","+"num of permiter"+"="+poly.computePerimeter());

			
		}

	}

}