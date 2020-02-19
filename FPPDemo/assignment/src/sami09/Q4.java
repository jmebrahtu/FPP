 package sami09;

public class Q4 {

	public static void main(String[] args) {
		
		 /* Write a function int hasNFollowingComposites(int n, int count) that returns 1
		 * if n is a prime number and the next count numbers are composite(non-prime).
		 * Otherwise, it returns 0. Recall that a prime number is a number whose only
		 * factors are 1 and itself. You may assume that n and count are greater than
		 * zero. */
		

		int result = hasNfollowingComposites(23, 5);// revise again is so important
		System.out.println(result);
	}

	public static int hasNfollowingComposites(int n, int count) {
		if ((!isPrime(n)) || (n == 0)) {
			return 0;
		} else {
			for (int i = n + 1; i <= n + count; i++) {//=
				if (!isComposite(i)) {// NB

					return 0;
				}
			}
			return 1;
		}
	}

	public static boolean isPrime(int n) {
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;

			}

		}
		
			return true;
		

		}
   public static  boolean isComposite(int a) {
	   for(int i=2;i<a;i++) {
		   if(a%i==0) {
			   return true;
			   
		   }
		   
	   }
	   return false;
   }
	}


