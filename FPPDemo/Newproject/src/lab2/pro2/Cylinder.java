package lab2.pro2;

public class Cylinder extends Circle {
	private double height;

	Cylinder() {// default constractor

	}

	Cylinder(double radius) {// one parametrize constractor
		super(radius);

	}

	Cylinder(double radius, double height) {// two parametrized constractor
		super(radius);
		this.height = height;

	}

	public double getHeight() {
		return height;
	}
public double getVolume() {
		double Volume = 0.0;
		Volume = ((Math.PI) * (Math.pow(getRadius(), 2)) * height);
		return Volume;
	}

}
