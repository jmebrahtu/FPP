 package sami04;

public class CucumberArray {

	public static void main(String[] args) {

		
		 /* A Cucumber array is defined to be an array in which exactly one pair of
		 * numbers sum to 15. For example, {3, 8, 12} is a Cucumber array because only 3
		 * and 12 sum to 15. The array {1, 3, 15} is not a Cucumber array because no two
		 * numbers sum to 15. The array {3, 4, 12, 11} is not a Cucumber array because
		 * both 3+12 and 4+11 sum to 15 Write a function named isCucumber that returns 1
		 * if its array argument is a Cucumber array, otherwise it returns 0. If you are
		 * programming in Java or C#, the function signature is int isCucumber(int[ ] a)
		 * If you are programming in C or C++, the function signature is int
		 * isCucumber(int a[ ], int len) where len is the number of elements in a. Copy
		 * and paste your answer here and click the "Submit answer" button Solution*/
		 
		int[] list = { 4, 2, 11,13 };
		int result = isCucumberArray(list);
		System.out.println(result);
	}
//I make mistake in this so it required to me revise again and again.
	public static int isCucumberArray(int[] a) {
		int count = 0;

		if (a == null || a.length < 2) {
			return 0;
		}
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {//NB
				if (a[i] + a[j] == 15) {
					count++;
				}
			}
			}
		if (count == 1) {
			return 1;

		} else {
			
		}
		return 0;
	}
}
