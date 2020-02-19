 package sami04;

public class DaphneArray {

	public static void main(String[] args) {
		
		 /* 2.A Daphne array is defined to be an array with alternating positive and
		 * negative numbers. It may start with either a positive or negative number but
		 * after that the positive and negative numbers alternate. For example, {1, -3,
		 * 5, -6}, {-3, 5, -6}, {1, -3, 5}, {-3, 5}, {-3} and {5} are all Daphne arrays.
		 * However, the arrays {1, 1, -3, 5}, {-2, -2, -2} and {1, -1, 2, 2} are not
		 * Daphne arrays because they either have two consecutive positive or two
		 * consecutive negative numbers. Write a function named isDaphneArray that
		 * returns 1 if its array argument is a Daphne array, otherwise it returns 0. If
		 * you are programming in Java or C#, the function signature is int
		 * isDaphneArray(int[ ] a) If you are programming in C or C++, the function
		 * signature is int isDaphneArray(int a[ ], int len) where len is the number of
		 * elements in a. Copy and paste your answer here and click the "Submit answer"
		 * button */
		

		int[] sis = { -2, 3, -6, 2, -7 };
		int result = isDaphneArray(sis);
		System.out.println(result);
	}

	public static int isDaphneArray(int[] a) {
		if (a == null || a.length < 2) {
			return 0;
		}
		for (int i = 0; i < a.length-1; i++) {//NB
			if (!((a[i] > 0 && a[i + 1] < 0) || (a[i] < 0 && a[i + 1] > 0))) {
				return 0;
			} 
			
		}
		return 1;
	}
}
