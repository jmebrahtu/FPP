 package sami06;

public class Q3 {

	public static void main(String[] args) {

		
		 /* 3. An array is defined to be zero-shifted if all zeros (if any) occur at the
		 * end of the array. For example, {3, 1, -4, 0, 0}, {0, 0, 0} and {1, 2, 3} are
		 * zero-shifted arrays but {0, 0, 1, 2, 0, 0, 0} and {1, 2, 0, 3, 4, 0} are not.
		 * Write a function named isZeroShifted that returns 1 if its array argument is
		 * a zero-shifted array, otherwise it returns 0. If you are writing in Java or
		 * C#, the function prototype is int isZeroShifted(int[ ] a) If you are writing
		 * in C or C++, the function prototype is int isZeroShifted(int a[ ], int len)
		 * where len is the number of elements in a Examples*/
		 
		int[] n = {1,2,3,4,0,0};
		int result = zeroShifted(n);
		System.out.println(result);

	}

	public static int zeroShifted(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == 0) {
				for (int j = i+1; j < a.length; j++) {
					if (a[j] != 0) {
						return 0;
					}

	 			}

			}
		}
		return 1;
	}
}
