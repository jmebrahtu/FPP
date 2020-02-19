package sami09;

public class Q8 {

	public static void main(String[] args) {
		
	
		/* 10. A non-empty array a of length n is called an array of all possiblities if
		 * it contains all numbers between 0 and a.length-1 inclusive. Write a method
		 * named isAllPossibilities that accepts an integer array and returns 1 if the
		 * array is an array of all possiblities, otherwise it returns 0. */
		int[]num= {1,3,2,0};
		int result=isAllPossibilities(num);//totally i must revise it;
				System.out.println(result);
	        }
	   public static int isAllPossibilities(int[] a) {
		   
		   int count=0;
			
			for (int i=0;i< a.length;i++){
				for(int x:a){			
					if (i==x) {
						count++;
						}
				      }
				if(count!=1) {
					return 0;
				}
				count=0;
					}
			return 1;
		}
}
	   
  