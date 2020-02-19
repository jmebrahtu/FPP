 package lab3.prog1;

import java.util.Arrays;

/**
 *
 * swap the smallest element to 0th position in the array
 *
 */
public class SmallestElement {

	public static void main(String[] args) {

		int[] a = { 16, 35, 7, 1, -4, 36, 49 };
		int result=minElment(a);
		System.out.println(result);
	}
		//System.out.println(Arrays.toString(a));

		public static int minElment(int[]nums) {
		//implement
		int min=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min) {
				min=nums[i];
			}
			
		}
		return min;
		
//		[-4, 35, 7, 1, 16, 36, 49] is the expected output.
	}

}
