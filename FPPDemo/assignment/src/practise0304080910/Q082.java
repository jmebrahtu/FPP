package practise0304080910;

public class Q082 {

	public static void main(String[] args) {

		
		 /* 2. Define an array to be a Martian array if the number of 1s is greater than
		 * the number of 2s and no two adjacent elements are equal. Write a function
		 * named isMartian that returns 1 if its array argument is a Martian array,
		 * otherwise it returns 0. There are two additional requirements. You should
		 * return 0 as soon as it is known that the array is not a Martian array;
		 * continuing to analyze the array would be a waste of CPU cycles. There should
		 * be exactly one for loop in your function If you are programming in Java or
		 * C#, the function signature is int isMartian(int[ ] a) If you are programming
		 * in C or C++, the function signature is int isMartian(int a[ ], int len) where
		 * len is the number of elements in the array a.*/
		 
		int[] list= {2,3,9,5,6};
        int result=isMartianArray(list);
        System.out.println(result);
	}

	public static int isMartianArray(int[] a) {
		
		if (a == null || a.length < 2) {
			return 0;
			//if (a[i] != 1) {
				//return 0;
			}
		//}
		for (  int i=1;i < a.length; i++) {
			if (a[i] == 1 && a[i] > a[i + 1]) {

			}
			

		}
		return 1;
	}
}
