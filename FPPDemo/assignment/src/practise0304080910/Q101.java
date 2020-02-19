package practise0304080910;

public class Q101 {

	public static void main(String[] args) {
		/*
		 * 1. Write a function that accepts an array of integers and returns an integer
		 * that represents the biggest difference b/n any two values in the array. If
		 * array is null or has a length 0 or 1, return -1.for this problem do not use
		 * any sorting routines that are part of the language library.
		 */
		//int[] list= {1,1,1,1};
		int[]sis= {-1,-2,-6,-3};
		//int[] num= {-1,-2,-6,3};
		int result=difference(sis);
		System.out.println(result);
	}

	public static int difference(int[] a) {
		int difference = 0;
		int largest=0 ;
		 int smallest=0;
		if (a == null || a.length <= 1) {
			return 1;
		}

		for (int i = 0; i < a.length; i++) {
			if (largest > a[i]) {
				largest =  a[i];

			}
			if (smallest < a[i]) {
				smallest = a[i];
			}
			difference = largest - smallest;
		}

		return difference;

	}
}
