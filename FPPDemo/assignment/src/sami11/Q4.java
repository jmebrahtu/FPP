package sami11;

public class Q4 {

	public static void main(String[] args) {

		
		 /* 4. Write an array of a function that accepts an array of integers and returns
		 * the number of distinct integers in the array.*/
		 

		int[] list = { 2, 6, 3, 3, 4, 5, 2 };
		int result = numDistinctInteger(list);
		System.out.println(result);

	}

	public static int numDistinctInteger(int[] a) {
		int count = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				if ((a[i] == a[j]) && (i == j)) {
					count++;
				}
				
				if ((a[i] == a[j]) && (i != j)) {
					
                  break;
				}
				}
			
		}
		return count;
	}
}
