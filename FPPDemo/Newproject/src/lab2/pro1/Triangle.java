package lab2.pro1;

public final class Triangle {
	private final double  base;
	private final double  height;
	
	Triangle(double  base,double  height) {
		this.base= base;
		this.height=height;
		
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
	public double computeArea() {
		 return base*height*0.5;
		
		
	}
}
