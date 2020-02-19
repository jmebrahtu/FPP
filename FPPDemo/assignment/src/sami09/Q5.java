package sami09;

public class Q5 {

	public static void main(String[] args) {

		
		 /* 5, Write a function named equivalentArrays that has two array arguments
		  *  and returns 1 if the two arrays contain the 
		  * same values (but not necessarily in the same order), otherwise it returns 0. 
		  * Your solution must not sort either array or a copy of either array! 
		  * You may assume that both arrays have the same number of elements. */
		 
		int[] list = { 2, 2, 3, 3 };
		int[] num = { 2, 1, 3, 3 };
		int result = equivalentArracount(list, num);
		System.out.println(result);
	}

	public static int equivalentArracount(int[] a1, int[] a2) {
		

		if (a1.length != a2.length) 
			return 0;

		
		for (int i = 0; i < a1.length; i++) {
			if (count(a1, a1[i]) != count(a2, a1[i])) {//
				return 0;
			}
         
		}
		 return 1;
	}

    public static int count(int[] x, int y) {// this count with first array
		int count = 0;

		for (int i = 0; i < x.length; i++) {
			if (y == x[i]) {
				count++;
			}

		}
		return count;
	}
}