package Day2practise;

import java.util.Arrays;

public class ArrayPractise {

	public static void main(String[] args) {
		
		//boolean experision# how to use (condition)? if true return this one :else go to the other chose;
		int x= 1;
		int y=10;
		int z= (x<y)?x+5:y+8;
		System.out.println(z);
		int[] nums = { 2, 4, 3, 8, 10,11, 14, 16, 17, 20 };
		
      for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
			System.out.println(nums[i]);

			}
			
		}

		
		 for (int i = 0; i < nums.length; i++) { if (nums[i] % 2 == 0) {
		 System.out.println(nums[i]); }
		 
		 }
		
	}
}
