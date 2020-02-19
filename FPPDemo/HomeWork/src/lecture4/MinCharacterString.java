package lecture4;

public class MinCharacterString {

	public static void main(String[] args) {

		System.out.println(minChar("Akel"));
	}

	

	public static char minChar(String str) {
		return minChar(str.substring(1), str.charAt(0));
	}

	public static char minChar(String subStr, char c) {
		if (subStr.length() == 0) {
			return c;
		} else {
			if (subStr.charAt(0) == c)
				c = subStr.charAt(0);
			return minChar(subStr.substring(1), c);
		}

	}

}
