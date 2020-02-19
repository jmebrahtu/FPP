package lab3.pro2;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

//		int[] nums = { 16, 35, 7, 1, -4, 36, 49 };
		int[] a = {-2,45,0,11,-9};
		//int[] a = { 16, 35, 7, 1, 4 };

		// implement

		for (int i = 0; i < a.length; i++) {// the first loop takes one number and then
			for (int j = i+1; j < a.length; j++) {// goes to this loop and compare with all the elemnets in the array
				if (a[j] < a[i]) {//if a[j]<a[i]then the temp will contians the a[j];
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			System.out.println(Arrays.toString(a));

		}
		System.out.println(Arrays.toString(a));
	}
}
