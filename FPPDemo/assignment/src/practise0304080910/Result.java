package practise0304080910;

import java.util.Arrays;

public class Result {
   public static void main(String[]arg) {
	   int[] smallPrimes = { 2, 3, 5, 7, 11};  
	   int[] copy = new int[5];  System.arraycopy(smallPrimes, 0, copy, 0, 5);  
	   //int[] small = { 2, 3, 5, 7, 11};
	   int[] luckyNums = {350, 400, 150, 200, 250};  System.arraycopy(smallPrimes, 1, luckyNums, 3, 2);
	   //luckyNums is now [350, 400, 150, 3, 5]  //now sort  Arrays.sort(luckyNums);  
	   //luckyNums is now [3, 5, 150, 350, 400
   
 }

}