package sami09;

public class Q1 {

	public static void main(String[] args) {
		
		/*1.Write a function that will iterate through an array a as follows. Start at a[0].
		 *  If a[0] is -1 return -1. If a[0] is less than -1 or greater than or equal to the length 
		 *   of the array (i.e., it can't be used to index an element of the array), return 1.
		 *   Otherwise visit a[a[0]] and repeat these steps. This could potentially result 
		 *   in an infinite loop. If an infinite loop is detected the function should return a 0. */
		  
	/*To summarize: 
	1.	iterate through the array using the value of an element 
	as the index to the next element (like in a linked list) 
	2.	return -1 if a -1 encountered 
	3.	return 1 if a value less than -1 or greater than or equal to the size of the array is encountered. 
	4.	return 0 if an infinite loop is detected. */
	   // totally wronge.
                  int[]num= {9,3,4,-1,1,2};
                 int result=inputArray(num);
                 System.out.println(result);
	}//I make totally mistake.I will do again and again.
      public static int inputArray(int[] a) {
    	  if(a[0]==-1) {
    		  return -1;
    		  
    	  }
    	  if(a[0]<1||a[0]>=a.length) {
    		  return 1;
    		  
    	  }else {
    		  
    		  
    	  }
    	  return 0;
      }
} 
