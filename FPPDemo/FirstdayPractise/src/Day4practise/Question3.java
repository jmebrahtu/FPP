package Day4practise;

public class Question3 {

	public static void main(String[] args) {
		int a=1;
		
		Question3 rt= new Question3();
		System.out.println("Before modify() a="+a);//without modify a will be 1;
		rt.modify(a);//  the value of a will not change cuz it simply reference the same object 1; 
		System.out.println("After modify a="+ a);// so the a will be 1;
	}

	void modify(int number) {
		number= number+1;
		System.out.println("number="+number);//we arleady passed for this a at the above so the result will be 2
		
	}
}
