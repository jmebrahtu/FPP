package practise0304080910;

public class Practise {

	public static void main(String[] args) {

		int[] k= {1, 2, 2, 2, 3, 3};
		int result=isLayredArray(k);
		System.out.println(result);
	}
    public static int isLayredArray(int[] a) {
    	int n1=a[0];
    	
    		
    	
    	for(int i=0;i<a.length;i++) {
    		if(!(isAscending(a)||count(a,n1))) {
    			return 0;
    		}
    		
    	}
    	return 1;	
    }
    	
    
    public static boolean isAscending(int[]b) {
    	
    	for(int i=0;i<b.length-1;i++) {
    		if(b[i]>b[i+1]) {
    			return false;
    			
    		}
    		
    	}
    	return true;
    }
    public static boolean count(int[]a,int x) {
    	int count=0;
    	for(int i=0;i<a.length;i++) {
    		if(a[i]==x) {
    			count++;
    			
    		}
    	}
    	if(count<2) {
    		return false;
    		
    	}
    	return true;
    }
	}
		
	

	
	


