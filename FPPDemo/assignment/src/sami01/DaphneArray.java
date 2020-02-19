package sami01;

public class DaphneArray {

	public static void main(String[] args) {

		
		 /* 2. A Daphne array is defined to be an array where the minimum and maximum
		 * values occur exactly once and the minimum value occurs after the maximum
		 * value in the array. For example {10, -2, 3, -6, 9} is a Daphne array because
		 * it satisfies all the conditions: The maximum value 10 occurs only once The
		 * minimum value -6 occurs only once -6 occurs after 10 in the array.
		  * Write a function named isDaphneArray that returns 1 if its array argument is
		 * a Daphne array, otherwise it returns 0.*/
		 
           int[]num= {10,10,3,4,6,-1,9,9};
           int result=Daphne(num);
           System.out.println(result);
	}

	public static int Daphne(int[] a){
		int max = 0;
		int min = 0;
		int maxindex = a[0];
		int minindex = a[0];
		if (a == null || a.length < 2) {
			return 0;

		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				maxindex = i;
			}
			if (a[i] < min) {
				min = a[i];
				minindex = i;
			}
		}
		if(check(a,max)&& check(a,min)) {
			if(minindex>maxindex) {
				return 1;
				
		}

		
	}
		return 0;
}

public static boolean check(int []a,int b) {
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==b) {
			count++;
			
		}
		if(count!=1) {
			return false;
			
			
		}
	}
	return true;
}
}