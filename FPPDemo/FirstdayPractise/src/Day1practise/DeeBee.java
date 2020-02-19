package Day1practise;

public class DeeBee {
	// expected out put=DooBeeDooBeeDo// so we must print with out ln
	public static void main (String[]a) {
		int x= 1;
		while( x<3) {// DooBee will print 2times b/c x<3 for 1 and 2
			System.out.print("Doo");
			
			System.out.print("Bee");
			x= x+1;
		}
		if(x==3) {// this one will be once only
			System.out.print("Do");
		}
	}
	

}
