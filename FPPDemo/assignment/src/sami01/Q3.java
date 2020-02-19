package sami01;

public class Q3 {

	public static void main(String[] args) {
		
		 /* 3. An Olympic array is defined to be an array in which every value is greater
		 * than or equal to the sum of the values less than it. The sum of the values
		 * less than the minimum value in the array is defined to be 0. For example, {3,
		 * 2, 1} is an Olympic array because 1 is the minimum value and by definition
		 * the sum of the values less than it is 0. Since 1 is greater than 0, it
		 * satisfies the condition. There is only one value less than 2 and 2 is greater
		 * than it, so the value 2 satisfies the condition. The values 1 and 2 are less
		 * than 3 and 3 is equal to their sum, so the value 3 satisfies the condition.
		 * Hence all elements of the array satisfy the conditions and the array is an
		 * Olympic array. {2, 2, 1, 1} is also an Olympic array because the values less
		 * than 2 sum to 2. {1, 1000, 100, 10000, 2} is also an Olympic array. However,
		 * {1, 99, 99, 1000, 100, 10000, 2} is not an Olympic array because the sum of
		 * the numbers less than 100 (99+99+1) is greater than 100. Please be sure that
		 * your function detects that this is not an Olympic array! {1, 2, 1, 3, 2} is
		 * not an Olympic array because 3 is not greater than or equal to 1+2+1+2. {1,
		 * 2, -1, 2, 2} is not an Olympic array because -1 is the minimum value but it
		 * is not greater than or equal to 0. Write a function named isOlympic that
		 * returns 1 if its array argument is an Olympic array, otherwise it returns 0.
		 * If you are writing in Java or C#, the function signature int isOlympic (int[
		 * ] a)*/
		// it is not clear for me this one 
		 

		//int[] list = { 3, 2, 1 };
		int[] num = { 12, 6,6 };
		
		//System.out.println(result);
		System.out.println(isOlympic(num));
	}

	public static int isOlympic(int[] a) {
	
		int summin=0;
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				if(a[j]<a[i]) {
					summin+=a[j];
					
				}
				
			}
			if(a[i]<summin) {
				return 0;
			}
			summin=0;   //to reset again
		}
		return 1;
	}
}

