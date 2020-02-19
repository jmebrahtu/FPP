package Day4practise;

public class Question2 {

	public static void main(String[] args) {
		Dimension d= new Dimension(5,10);
		
		Question2 rt= new Question2();
		System.out.println("Before modify() d.height="+d.height);//in this simple they call the method so 10
		
		rt.modify(d);//  we are calling after modifying the height with one  so 11
		System.out.println("After modify() d.height="+d.height);// the result will be 11
	}
   void modify(Dimension dim) {
	   dim.height= dim.height+1;
	   System.out.println("dim="+dim.height);// 11 will be the answer
   }
}
