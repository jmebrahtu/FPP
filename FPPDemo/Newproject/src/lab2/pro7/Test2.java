package lab2.pro7;

public class Test2 {

	public static void main(String[] args) {

		Polygon[] objects = { new Triangle(2, 3, 4), new Rectangle(5, 2), new Square(4) };
		for (Polygon po : objects) {

			System.out.println("By implements the method form Polygon to " + po.getClass().getSimpleName() + "\n"
					+ "Num of sides=" + po.getNumberOfSide() + "," + " num of perimeter= " + po.computePermiter());
		}
	}
}
