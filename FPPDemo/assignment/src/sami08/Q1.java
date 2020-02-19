package sami08;

public class Q1 {

	public static void main(String[] args) {

		
		 /* 1.Given a positive integer k, another positive integer n is said to have
		 * k-small factors if n can be written as a product u*v where u and v are both
		 * less than k. For instance, 20 has 10-small factors since both 4 and 5 are
		 * less than 10 and 4*5 = 20. (For the same reason, it is also true to say that
		 * 20 has 6-small factors, 7-small factors, 8-small factors, etc). However, 22
		 * does not have 10-small factors since the only way to factor 22 is as 22 = 2 *
		 * 11, and 11 > 10. Write a function has with signatuare boolean
		 * hasKSmallFactors(int k, int n) which returns true if n has k-small factors.
		 * The function should return false if either k or n is not positive.*/
		 

		System.out.println(hasKSmallfactors(22, 11   ));

	}

	public static boolean hasKSmallfactors(int k, int n) {
		if (k <= 0 || n <= 0)
			return false;

		

			for (int i = 1; i < k; i++) {

				if (n % i == 0) {
					if (i < k && n / i < k) {
						return true;
					}
				}
			}

			return false;
		}
	}
