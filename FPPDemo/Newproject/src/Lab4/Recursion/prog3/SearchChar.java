package Lab4.Recursion.prog3;

public class SearchChar {

	public static void main(String[] args) {

		String k = "akcleb";
		System.out.println(binarySearcChar(k,'x'));
		
	}

	public static boolean binarySearcChar(String s, char c) {
		int left = 0;
		int right = s.length() - 1;
		while (left <= right) {
			int mid = left + right / 2;
			if (s.charAt(mid) == c) {
				return true;
			} else if (c < s.charAt(mid)) {
				right = mid - 1;
			} else {
					left = mid + 1;
				
			}
		}
		return false;
	}
}
