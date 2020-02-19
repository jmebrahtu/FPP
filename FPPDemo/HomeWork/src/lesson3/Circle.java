package lesson3;


	final class Circle {
		private double radius;
		private double area;
		

		public Circle(double radius) {
			this.radius = radius;
			this.circleArea(radius);
		}

		public double getRadius() {
			return radius;
		}

		private void circleArea(double radius) {
			area = Math.PI*radius * radius;
			System.out.println("Area of the radius is : " + area);

		}


	}



