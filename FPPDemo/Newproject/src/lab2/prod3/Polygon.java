package lab2.prod3;

public interface Polygon {

	//public int getNumberOfSide();
	//public double computePermiter();
	
	public  double[] getArrayOfSide();
	
	static double sum(double[]arr) {
		double sum=0;
		for (double d : arr) {
			sum+=d;
			
		}
		return sum;
		
		
	}
	default double computePerimeter() {
		
		return sum(getArrayOfSide());
		
	}

	

	
}
