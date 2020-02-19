package sami09;

public class NQ33 {

	public static void main(String[] args) {
		
	

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
