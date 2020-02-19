package sami11;

public class Q2 {

	public static void main(String[] args) {

		
		 /* 2.Define an array to be cumulative if the nth (n>0)elements of the array is
		 * the sum of the first n elements of the array. So {1,1,2,4,8} is cumulative
		 * b/c a[1]=1=a[0] a[2]=2=a[0]+a[1] a[3]=4=a[0]+a[1]+a[2]
		 * a[4]=8=a[0]+a[1]+a[2]+a[3] write a fun named isCumulative that accepts an
		 * array of integers and returns returns 1 if the array is cumulative and 0
		 * otherwise */
		
         int[]list= {4,4,8,16};
         int result=isCumulative(list);
         System.out.println(result);
	}

	public static int isCumulative(int[] a) {
		if (a.length == 0) {
			return 0;

		}
		if (a.length == 1) {
			return 1;
		}
		int sum = 0;
		for (int i = 1; i < a.length; i++) {

			for (int j = 0; j < i; j++) {
				sum += a[j];

			}
			if (sum != a[i]) {
				return 0;
			}
			sum = 0;

		}

		return 1;
	}

}
