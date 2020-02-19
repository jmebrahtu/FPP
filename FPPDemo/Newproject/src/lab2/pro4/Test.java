package lab2.pro4;

class Test {
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(5, 7),
				new Square(3), 
				new Circle(3) };
		
		
		for (ClosedCurve dd : objects) {
			
	System.out.println(dd.getClass().getSimpleName()+":"+dd.computeArea());
		}
	}
}
/*
 * // compute areas for (Object o : objects) { if (o instanceof Triangle) {
 * Triangle t = (Triangle) o; System.out.println(t.computeArea()); } if (o
 * instanceof Square) { Square s = (Square) o;
 * System.out.println(s.computeArea()); } if (o instanceof Circle) { Circle c =
 * (Circle) o; System.out.println(c.computeArea()); } }
 */