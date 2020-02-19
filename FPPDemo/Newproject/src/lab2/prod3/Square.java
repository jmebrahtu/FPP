package lab2.prod3;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	@Override
	public double[] getArrayOfSide() {
		double[] temp= new double[] {side,side};
		return temp;
	}
	
		
	
		
	}



