package sami09;

public class Q6 {

	public static void main(String[] args) {

		
		 /* 6, Write a function named hasTwoValues which takes an array as an argument.
		 * It returns 1 if all the elements of the array are one of two different
		 * values, otherwise it returns 0. Your solution must make exactly one pass
		 * through the array. It must not sort the array or a copy of the array.
		 * Furthermore, your solution must not have any nested loops in it! We are
		 * looking for a solution that minimizes time. Note that an element of the array
		 * can be any value including 0, negative numbers, the maximum integer and the
		 * minimum integer.*/
		 
		int[] list = { 1, 2, 1, 2,1};
		int result = hasTwoValues(list);
		System.out.println(result);
	}

	public static int hasTwoValues(int[] a) {
		int n1=a[0];
		int n2=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]!=n1) {
				n2=a[i];
				break;
			}
		}
			if(n1==n2) {
				return 0;
				 
				}
		int count1=count(a,n1);
		int count2=count(a,n2);
		if(a.length!=count1+count2) {
			return 0;
			
		}
		return 1;
	}
	public static int count(int[]n,int a) {
		int count=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]==a) {
				count++;
				
			}
			
		}
		return count;
	}
}
