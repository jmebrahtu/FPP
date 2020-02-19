package Day6practise.Innerclass;

public class A {

	public static void main(String[] args) {
		// new A();
		B a = new B(new A());
		a.Bmethod();// by B class we create B type and have the constractor with 1 input
					// so this go to class B and calling for B consractor B(A m)and then to the
					// method and then
					// back and print.. the java
	}

	void mymethod() {
		System.out.println("Jirom");
	}
}

class B {
	A m;

	B(A m) {
		this.m = m;
		Bmethod();

	}

	void Bmethod() {
		m.mymethod();
	}
}
