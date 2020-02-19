package Lab4.pro1Recursion.prog4_2;


public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.factorialWithoutRecursion(5) );

	}
	private int factorialWithoutRecursion(int n) {
		
		
		// implement
		int  factorial= 1;
		for(int i= n;i>=1;i--) {
			factorial=factorial*i;
			
		}
		return factorial;
	}
	/*
	 * //or int result= 1; for(int i=1;i<=n;i++)
	 *  { result=result*i; } return result;
	 */
}
