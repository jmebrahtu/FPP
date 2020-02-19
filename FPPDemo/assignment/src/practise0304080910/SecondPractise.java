package practise0304080910;

public class SecondPractise {

	public static void main(String[] args) {
		int[]list= {1,1,2,4,8};
		int result=isCommulative(list);
		System.out.println(result);
			
		}

	
 public static int isCommulative(int[]a) {
	 if(a.length<2) {
		 return 0;
		 }
	 int sum=0;
	 for(int i=0;i<a.length;i++) {
		 for(int j=0;j<i;j++) {
			 sum+=a[j];
			 
		 }
		 if(sum!=a[i]) 
			 return 0;
		 }
	 
	 return 1;
 }
}
