package practise0304080910;

public class SingleReaptedNumber {
	public static void main(String[] args) {
		int[] n = { 2, 3, 3, 3, 2, 4, 5, 6 };
		int result = isMostReapeated(n);
		System.out.println(result);

	}

	public static int isMostReapeated(int[] a) {
  int count;
  int maxelement=a[0];
  int maxcount=0;
   for(int i=0;i<a.length;i++) {
	   count=1;
	   for(int j=i+1;j<a.length;j++) {
		   if(a[j]==a[i]) {
			   count++;
			   
		   }
		   if(count>maxcount) {
			   maxcount=count;
			   maxelement =a[j];
		   }
	   }
	   
   }
	return maxelement;
	}
}