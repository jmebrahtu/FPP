package practise0304080910;

public class Sumxples {

	public static void main(String[] args) {
		int[]x= {1,1,2,2,3,3,4,4,5,5};
		System.out.print(layered(x));
		
	}
	public static int layered(int[]a) {
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[i-1]) {
				return 0;
			}else {
				if(a[i]>=a[i-1]) {
					if(counter(a,a[i])<2) {
						return 0;
					}
				}
			}
		}
			return 1;
		
		
	}
	public static int counter(int[]a,int n) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				count++;
				
			}
			
		}
		return count;
	}
}