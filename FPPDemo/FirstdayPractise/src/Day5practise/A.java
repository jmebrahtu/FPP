package Day5practise;

public class A {

	int i=1;
	int f() {
		return i;
	}
	public static void main (String[]a) {
		A sub= new B();
		System.out.println(sub.f()); //the method goes to the B class cuz we need to access the b variable
	}
}
