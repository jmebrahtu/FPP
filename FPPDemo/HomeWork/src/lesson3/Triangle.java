package lesson3;

final class Triangle {
	private double height;
	private double base;
	private double area;
	public Triangle(double height, double base) {
		this.height= height;
		this.base = base;
		this.triangleArea(height, base);
	}
	public double getHeight() {
		return height;
	}
	
	public double getBase() {
		return base;
	}
	
	private void triangleArea(double height, double base) {
		area = 0.5 * height * base;
		System.out.println("Area of the triagle is : "+ area);
		
	}

}

