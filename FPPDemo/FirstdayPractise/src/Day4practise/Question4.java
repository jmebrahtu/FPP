package Day4practise;

public class Question4 {

	public static void main(String[] args) {
		int x= 1;
	 int [] y= new int[10];
	 method(x,y);
	 System.out.println("x is ="+x);//this will return 1;
	 System.out.println("y[0] is="+y[0]); //this will be return 5555

	}
 public static void method(int number,int[]numbers) {
	 number=1001;
	 numbers[0]= 5555;
 }
}
