package lab2.pro4;

final class Triangle extends ClosedCurve {
	/* we require height <= base */ final double base;
	final double height;

	Triangle(double base, double height) 
	{
		if (height <= base) {
			this.base = base;
			this.height = height;
		} else {
			this.base = height;
			this.height = base;
		}
		assert (height <= base);
	}

	private void verify_triangle(double base2, double height2)
		if(base2<=0 || height2 <= 0)
		{
			throw new IllegalTriagleException();
		}
		// TODO Auto-generated method stub
		
	}

	public double computeArea() {
		return (0.5 * base * height);
	}
}