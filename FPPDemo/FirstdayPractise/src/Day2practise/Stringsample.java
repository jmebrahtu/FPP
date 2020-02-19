package Day2practise;

import java.util.StringJoiner;

public class Stringsample {

	public static void main(String[] args) {
		int x = 65;
		String y = Integer.toString(x);
		System.out.println(y);
		String z = "Mike";

		System.out.println((z));

		// note that d\n functions of string

		String a = "  afriendly face";

		System.out.println("The char at index 2 is:" + a.charAt(2));
		System.out.println("The length of the String is:" + a.length());
		System.out.println("The char occur between index 2 and 9 is:" + a.substring(2, 9));
		System.out.println("THe char occur from index 4 after is :" + a.substring(4));
		System.out.println("Change the String to Capital letter:" + a.toUpperCase());
		System.out.println("Change the String to small Letter:" + a.toLowerCase());
		System.out.println("This helps to delet the whitespace at the first:" + a.trim());
		System.out.println("Replace 'e' with 'x':" + a.replace('e', 'x'));
		System.out.println("Replace all result:" + a.replaceAll("a", "d"));

		StringJoiner d = new StringJoiner(".", "[", "]");
		d.add("Jirom").add("Selam").add("Robiel");

		String desiredString = d.toString();
		System.out.println("StringJoiner" + desiredString);

		// how to count if vowel char is exist in the string;"a'e.i.o.u
		String box = "amonuel";
		int k= countVowel(box);
		System.out.println(k);
	}

	public static int countVowel(String a) {
		
		int count = 0;
		char ch;
		for (int i = 0; i < a.length(); i++) {
			char z = a.charAt(i);
			if (z == 'a' || z == 'u'||z=='e'||z=='o'||z=='i') {
				count++;

			}

		}
		return count;
		
	}

}
