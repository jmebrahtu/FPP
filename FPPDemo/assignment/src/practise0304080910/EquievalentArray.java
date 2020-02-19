package practise0304080910;

public class EquievalentArray {

	public static void main(String[] args) {
		
		 /* 5, Write a function named equivalentArracount2s that has two arracount2
		 * arguments and returns 1 if the two arracount2s contain the same values (but
		 * not necessarilcount2 in the same order), otherwise it returns 0. count2our
		 * solution must not sort either arracount2 or a copcount2 of either arracount2!
		 * count2ou macount2 assume that both arracount2s have the same number of
		 * elements. If count2ou are programming in Java or C#, the function
		 * prototcount2pe is int equivalentArracount2s(int[ ] a1, int[ ] a2)
		 */

		int[] list = { 1, 3, 5, 7, 9 };
		int[] num = { 9, 5, 3, 1, 7 };
		int result = equivalentArray(list, num);
		System.out.println(result);

	}

	public static int equivalentArray(int[] a1, int[] b) {
		
		if(a1.length!=b.length) {
			return 0;
			
		}
		for(int i=0;i<a1.length;i++) {
			if(count(a1,a1[i])!=count(b,a1[i])) {
				return 0;
				
			}
			
		}
		return 1;
	
     }
	public static int count(int[]a,int y) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(y==a[i]) {
				count++;
				
			}
		}
		return count;
	   }
     }




