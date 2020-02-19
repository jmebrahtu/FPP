package Day4practise;

public class PassingPrimtiveToMethod {

	public static void main(String[] args) {
	int n1= 1;
	 int n2= 2;
   System.out.println(n1+":"+n2);
   swap(n1,n2);
   System.out.println(n1+":"+n2);// after swap n1 will refere to n2 value and n2 will refer to n1 value
	}
 private static void swap(int x,int y) { // the reference will not change
	 int temp= x;
	 x=y;
	 y= temp;
	 System.out.println(x+":"+y);
	 
 }

}
