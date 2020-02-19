package sami02;

public class Q1 {

	public static void main(String[] args) {
		
		 /* 1. Define a dimple of an array of integers to be an element whose value is
		 * strictly less than the value of the element before it and strictly less than
		 * the value the element that follows it in the array. So 5 is a dimple of {10,
		 * 5, 8} and -1 and 83 are dimples of the array {3, -1, 0, 1000, 83, 84}. Write
		 * a function named countDimples that returns the count of the number of dimples
		 * in its array argument. If you are programming in Java or C#, the function
		 * signature is int countDimples(int[ ] n) If you are programming in C or C++,
		 * the function signature is int countDimples(int n[ ]) Some more examples if
		 * input array is return the score comment {1, 1, 2, 2, 3} 0 To be a dimple an
		 * element must be strictly less than its neighbors {1} 0 An array must have at
		 * least 3 elements to have a dimple {1, 0, 1, 0, 1} 2 Both 0s are dimples.
		 * Note: the maximum number of dimples that an array can have is (a.length-1)/2
		 * {0, 1, 0, 1, 0} 1 The second 0 is the only dimple {-1, -18736, 123817} 1 Do
		 * the math */
		 
		int[] n = { 10, 5, 8,5,3,6,5,3};
          int result =  (countDimples(n));
		System.out.println(result);
	}

	public static int countDimples(int[] a) {

		int count = 0;
		if (a.length < 3) {
			return 0;
		}
	
		for (int i = 1; i < a.length-1 ; i++) {
			if ((a[i]) < (a[i-1]) && (a[i] ) < (a[i+1] )) {

				count++;
			}
			
		}
		return count;
	}
}