package sami09;

public class Q11 {

	public static void main(String[] args) {
		
		 /* 12. Write a function that takes an array of integers as an argument and
		 * returns a value based on the sums of the even and odd numbers in the array.
		 * Let X = the sum of the odd numbers in the array and let Y = the sum of the
		 * even numbers. The function should return X - Y
		 *  The signature of the function is: int f(int[ ] a) */
		int[] list= {2,3,6,8,5,7};
		int result=sumOddEven(list);
		System.out.println(result);
	}
      public static int sumOddEven(int[]a) {
    	  
    	  int total=0;
    	  int x= 0;//sum of the odd numbers in the array
    	  int y=0;//sum of the even number in the array
      
      for(int i=0;i<a.length;i++) {
    	  if(a[i]%2!=0) {
    		  x=x+a[i];
    	  
    		if(a[i]%2==0) {
    			y=y+a[i];
    		}	
    		}
    		 total=x-y;
       	  
    	  }
       return total;
      }
}
