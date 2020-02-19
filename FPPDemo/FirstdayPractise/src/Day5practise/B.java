package Day5practise;

public class B extends A {
	int i=3;
	int f() {
		i= super.i+1;
		return super.f()+i;
	}
}
