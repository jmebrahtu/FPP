package Day2practise;

public class Reverse {

	public static void main(String[] args) {
		String k = "JiromHiyabu";
		String rev = "";
		int length = k.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + k.charAt(i);
			if (k.equals(rev)) {
				
				System.out.println("k is paladriome");
			}
		}
		System.out.println(rev);
		System.out.println("k is not paladriome");
	}

}
