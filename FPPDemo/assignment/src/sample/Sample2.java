package sample;

public class Sample2 {

	public static void main(String[] args) {
		int[]b= {12,2,10};
		int result=isFun(b);
		System.out.println(result);
		
		
	}
	public static int isFun(int[]a) {
		
		for(int i=0;i<a.length;i++) {
			
		
			for(int j=i+1;j<i;j++) {
				if(a[i]+a[j]>a[i]) {
					return 0;
					
				}
				
			}
		}
		return 1;
		
		
	}
}
