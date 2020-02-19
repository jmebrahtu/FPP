package sami09;

public class Q10 {

	public static void main(String[] args) {

		
		 /* 11. Write a function that accepts an array of non-negative integers and
		 * returns the second largest integer in the array. Return -1 if there is no
		 * second largest. The signature of the function is int f(int[ ] a) */ 
		

		int[] list = { 1, 2, 3, 4, 5 };
		int result = secondLargest(list);
		System.out.println(result);
	}// i must revise this with attentively

	public static int secondLargest(int[] a) {
		int max1=1;
		int max2=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]!=max1&&a[i]>max2) {// I have a question in this . 
				max2=a[i];
			}
		}
		return max2;
	}
}
