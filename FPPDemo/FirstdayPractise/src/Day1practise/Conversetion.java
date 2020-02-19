package Day1practise;

public class Conversetion {

	public static void main(String[] args) {
		// how primitive change to wrapper
		int a = 10;
		Integer s = Integer.valueOf(a);
		System.out.println("converting int to Integer using Integer.valueOf" + s);// Casting from int to integer

		int x = 5;
		Integer y = Integer.valueOf(x);
		System.out.println(y);

		// how wrapper value change to primitive;
		Integer z = 3;
		int c = z.intValue();
		System.out.println(c);//
		Integer d = 6;
		int q = d.intValue();
		System.out.println("converting integer in to int using x.intvalue " + q);
		// how to convert from float to int;
		float xy = 3.34532f;
		int k = (int) xy;
		System.out.println("casting float in to int" + k);

		// How to convert double to int
		double dou = 3.87;
		int p = (int) Math.round(dou);

		System.out.println("casting double using Math.round to int" + p);

	}

}
