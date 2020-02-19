package sami09;

public class Q2 {

	public static void main(String[] args) {

		
		 /* 2. Define an array to be cumulative if the nth (n > 0) element of the array
		 * is the sum of the first n elements of the array. So {1, 1, 2, 4, 8} is
		 * cumulative because*/
		 
		int[] list = { 1,1,2, 4, 8 };// check why it gives different result in this
		int result = cumulative(list);
		System.out.println(result);
	}// I must understand this first

	public static int cumulative(int[] a) {
		int sum = 0;
		if (a.length < 2) {
			return 0;
		}

		for (int i = 1; i < a.length; i++) {
			
			for (int j = 0; j < i; j++) {//explanation needed;

				sum += a[j];

			}

			if (sum != a[i]) {
				return 0;
			}
		}
		return 1;
	}
}