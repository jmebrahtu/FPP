
package sami09;

public class Q3 {

	public static void main(String[] args) {

		
		 /* 3. Write a function that takes two arguments, an array of integers and a
		 * positive, non-zero number n. It sums n elements of the array starting at the
		 * beginning of the array. If n is greater than the number of elements in the
		 * array, the function loops back to the beginning of the array and continues
		 * summing until it has summed n elements. You may assume that the array
		 * contains at least one element and that n is greater than 0.*/
		 
		int num = 6;
		int[] list = { 2, 3, 4, 8 };//it start counting from 1 not zero, and
		                          //i will make practice again and again
		int result = twoArguments(list, num);
		System.out.println(result);
	}

	public static int twoArguments(int[] a, int n) {
		int sum = 0;
		int reminder;
		int times;
		if (a.length < 2 || n < 0) {
			return 0;
		}
		if (a.length >= n) {
			for (int i = 0; i < n; i++) {
				sum += a[i];
			}
		
		} else {
			times = n / a.length;
			reminder = n % a.length;
			for (int y = 0; y < a.length; y++) {
				sum += a[y];
			}
				sum = sum * times;
				
				for (int z = 0; z < reminder; z++) {
					sum += a[z];

				}
			}
		
		return sum;
	}
}