package lab2.prod3;

public class Rectangle extends ClosedCurve implements Polygon  {
	private double width;
	private double length;
	
	 public Rectangle(double width,double length) {
		 this.width= width;
		 this.length= length;
	 }

	@Override
	public double[] getArrayOfSide() {
		double[] temp=  new double[] {width,width,length,length};
		return temp;
	}

	@Override
	double computeArea() {
		return width*length;
	}

	
}
