package lab2.pro7;

public class Rectangle extends ClosedCurve implements Polygon  {
	private double width;
	private double length;
	
	 public Rectangle(double width,double length) {
		 this.width= width;
		 this.length= length;
	 }

	@Override
	double computeArea() {
	return width*length;
	}

	@Override
	public int getNumberOfSide() {
		
		return 4;
	}

	@Override
	public double computePermiter() {// TODO Auto-generated method stub
		return 2*width+2*length;
	}

}
