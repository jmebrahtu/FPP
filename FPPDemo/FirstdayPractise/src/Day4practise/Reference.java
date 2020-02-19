package Day4practise;

public class Reference {

	public static void main(String[] args) {
		
		Number a= new Number();
		a.x=4;
		System.out.println("a.x="+a.x);// this will be 4;
		Number b= a;
		b.x=5;
		System.out.println("b.x="+b.x);//this will be 5;
		System.out.println("a.x="+a.x);// this will be 5
	}

}
