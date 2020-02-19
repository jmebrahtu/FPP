
package Day1practise;

public class OutPut {

	public static void main(String[] args) {
  String  atr = "jirom";
  char [] chars=atr.toCharArray();
  
  System.out.println(chars);
		OutPut o = new OutPut();

		o.go();
	}

	void go() {// i have a question in this how is the loop going
		int y = 7;
		for (int x = 1; x < 8; x++) {
			y++;
			if (x > 4) {
				System.out.println(++y + "");
			}
			if (y > 14) {
				System.out.println("x=" + x);
				break;
			}
		}
	}
}
