package lab2.pro7;

public final class Square extends ClosedCurve implements Polygon{
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	@Override
	public int getNumberOfSide() {
		return (int)side;
	}
	@Override
	public double computePermiter() {
		return 4*side;
	}


}
