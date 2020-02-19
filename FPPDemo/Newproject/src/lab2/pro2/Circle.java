 package lab2.pro2;

public  class Circle {
	 private double radius;
	
	
	Circle (){// default constractor
		
	}
	Circle (double radius){// constractor
		this.radius= radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return  Math.PI*radius*radius;
		
	}
}

