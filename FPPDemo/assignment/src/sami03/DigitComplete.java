package sami03;

public class DigitComplete {

	public static void main(String[] args) {
		
		 /* 3.An array is defined to be digit complete if it contains exactly one of each
		 * of the numbers 0 through 9. So {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} and {3, 2, 1,
		 * 0, 4, 5, 6, 9, 7, 8} are digit complete. The array {3, 2, 1, 0, 4, 5, 9, 7,
		 * 8} is not digit complete because it is missing the number 6. The array {3, 2,
		 * 1, 0, 4, 5, 6, 9, 7, 8, 4} is not digit complete because 4 occurs twice in
		 * it. Write a function named isDigitComplete that returns 1 if its array
		 * argument is digit complete. Otherwise it returns 0. If you are programming in
		 * Java or C#, the function signature is intisDigitComplete (int[ ] a) If you
		 * are programming in C or C#, the function signature is intisDigitComplete (int
		 * a[ ], intlen) where len is the number of elements in*/
		 

		int[] num = { 0, 4, 3,5, 2, 6, 7, 8, 9,1 };
		int result = isDigitComplete(num);
		System.out.println(result);
	}

	public static int isDigitComplete(int[] a) {
		if (a == null || a.length != 10) {
			return 0;

		}
		int count = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					count++;
				}
			}
			if (count != 1) {
				return 0;

			}

			else {
				count = 0;
			}
		}
		return 1;
	}
}
