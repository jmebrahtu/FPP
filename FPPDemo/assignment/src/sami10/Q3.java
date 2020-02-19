package sami10;

public class Q3 {

	public static void main(String[] args) {

		
		 /* 3. An array is called dual if it has an even numbere of elements and each
		 * pair of consecutive even and odd elements sum to the same value . Write a fun
		 * named isDual that accepts an array of integers an dreturns 1 if the array is
		 * dual,otherwise it returns 0.*/
		 
		int[]list= {1,2,3,0,1,2,3,0};
		int result =isDual(list);
        System.out.println(result);
	}

	public static int isDual(int[] a) {
		if ((a == null) || (a.length % 2 != 0) || (a.length != 0&& a.length < 4)) {
			return 0;
		}
		if (a.length == 0) {
			return 1;
		}
		for (int i = 0; i < a.length; i = i + 2) {// we add 2num, lets i is odd and even mean 1&0 then
			if (a[0] + a[1] != a[i] + a[i + 1]) { //  to find next num (i=0+2=even)&& (i=1+2=3=odd)
				return 0;

			}
		}
		return 1;

	}
}
