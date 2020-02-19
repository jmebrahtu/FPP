package sample;



public class Sample1 {

	public static void main(String[] args) {

		int[]a= {12,2,10};
		int result= maxDistance(a);
		System.out.println(result);
	}

	public static   int maxDistance(int[] a) {
		int sum=0;
	
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++) {
				if(a[j]!=a[i]) {
					sum=sum+a[j];
				}
			}
				if(a[i]>sum) {
					return 0;
				
					
				}
			sum=0;
				}
		return 1;
		}
			
		}
