package sami02;

public class Q3 {

	public static void main(String[] args) {

		
		 /* 3. An array is defined to be n-zero-packed if it contains two or more
		 * non-zero elements and exactly n zeroes separate all non-zero elements that
		 * would be adjacent if the zeroes were removed. For example, the array {1, 0,
		 * 0, 18, 0, 0, -8, 0, 0} is 2-zero-packed because there are two zeroes between
		 * the 1 and the 18 and two zeroes between the 18 and the -8 and this accounts
		 * for all the non-zero elements. The array {0, 1, 0, 0, 0, 6, 0, 8, 0, 0, 4} is
		 * not 2-zero-packed because there are three zeroes between the 1 and the 6 and
		 * only one zero between the 6 and the 8. Write a function named isNZeroPacked
		 * with the following signature
		 */
		int[] a = { 1, 0, 0, 2, 0, 0, 3, 0,6 };
		int n = 2;
		System.out.println(isNZeroPacked(a, n));
	}

	public static int isNZeroPacked(int[] a, int n) {
		int nonzerocount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				nonzerocount++;

			}
		}
			if (nonzerocount < 2) {  
				return 0;

			}
		
		int j = 0;
		int[] arr = new int[nonzerocount];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				arr[j] = i;
				j++;
			}
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] != n + 1) {// make attention in this 
				return 0;

			}

		}

		return 1;
	}
}