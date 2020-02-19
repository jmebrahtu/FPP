package Excerise1.pro.pro5.nested;


//inside secondpackage
public class CallingClass {
	public String readVal() {
		MyClass cl = new MyClass();
		return cl.getVal(); //produces a compiler error -- how to fix?
		//return null;
		
	}
	String name = "hello".getClass().getName();
	String name2= "Hello".getClass().getSimpleName();
}


