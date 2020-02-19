package Day2practise;

public class Practise {

	public static void main(String[] args) {
		 
		int z= 10;
		
		//System.out.print(Ternary(z));
		int[] mylist = {16,35,7,1,4};
		int res= sum(mylist);
		System.out.println(res);
		int result= largest(mylist);
		System.out.println(result);
		
	}
   public static  int sum(int []a) {
        	int sum1=0;
        	for( int i=0; i<a.length;i++) {
        		sum1+=a[i];
        	}
        	return sum1;
        }
 public static int largest(int []b) {
        	int max= b[0];
        	for(int i =0;i <b.length;i++) {
        		if(b[i]>max) {
        			max= b[i];
        			
        		}
        	}
        	return max;
        	
        }
 public static void reverse() {
	 String k= "POP";
	 StringBuilder temp= new StringBuilder();
	
	 temp.append(k);
	 String  result= temp.reverse().toString();
	 if(k.equals(result)) {
		 System.out.println("palaridom");
		 
	 }else {
		 System.out.println("not Palaridom");
		 
	 }
	 
	
	 
 }
 public boolean Ternary(int f) {
	 
	 String y=(f%2==0)?"Even":"Odd";
	 System.out.println(y);
	return false;
	 
 }

}
