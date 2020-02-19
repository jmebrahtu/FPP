package sami10;

public class Q2 {

	public static void main(String[] args) {
		/*2.An array is called balanced if its even numbered elements (a[0],a[2], etc )are even 
		 * and its odd numbered elements are odd. Write a fun named isBalanced that accepts an array of 
		 * integers an dreturns 1 if the array is balanced,otherwise it returns 0.*/
		int[]list= {2,4,4,3,6,4,8};
		int result=isBalanced(list);
		System.out.println(result);
	}
      public static int isBalanced(int[] a) {
    	if(a==null||a.length<2) {
    		return 0;
    	}
    	for(int i=0;i<a.length;i++) {
    		if(a[i]%2!=i%2) {
    			return 0;
    		}
    			
    		}
    	return 1;
    	}
    		
    	}
    		
    	
    	