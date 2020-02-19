package lesson2;

public class Prog2 {

	public static void main(String[] args) {
		float x= 1.27f;
		float y= 3.881f;
		float z=9.6f;
		
		
		int sum= (int)(x+y+z);
		System.out.println(sum);
       int sum2= (int)(Math.round(x+y+z));
       System.out.println(sum2);
	}

}
