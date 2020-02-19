package practise0304080910;

public class Jirom {

	public static void main(String[] args) {
  int[] b= {1,2,3,4};
  int result=isLargestPrimeFactor(b);
		System.out.println(result);
	}

	public static int isLargestPrimeFactor(int[] a) {
	int max1=a[0];
	int max2=a[0];
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]>max1) {
	    		max1=max2;
	    		max1=a[i];
	    	}else {
	    		if(a[i]!=max1&&a[i]>max2) {
	    			max2=a[i];
	    		}
	    	}
	    	
	    }
	    return max2;
	}
}
