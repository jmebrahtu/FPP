package Lab4.pro1Recursion.prog4_2;

import java.util.Arrays;


public class Fibonacci {

	public static void main(String[] args) {
		//int [] store;
		Fibonacci f = new Fibonacci();
		System.out.println(f.fibWithoutRecursion(5));
	}

	private int fibWithoutRecursion(int n) {
		int []a;
		a = new int [n+1];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<=n;i++) {
			a[i]=a[i-1]+a[i-2];
			
		}
		return a[n];
	}
}
