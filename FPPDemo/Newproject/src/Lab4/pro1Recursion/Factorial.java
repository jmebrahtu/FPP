package Lab4.pro1Recursion;

/**
 * 
 * n!=n×(n−1)×(n−2)×...×3×2×1
 *
 * n! = n x (n-1)!
 * 0!=1
 */
public class Factorial {


	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println("With Recursion: " +f.factorial(5));
	}
	private int factorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}


}
