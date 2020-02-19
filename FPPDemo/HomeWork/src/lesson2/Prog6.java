package lesson2;

import java.util.Arrays;

public class Prog6 {
	public static void main(String[] args) {
		String[] orginal = { "horse", "dog", "cat", "horse", "dog" };
		String[] noDups = new String[ orginal.length];
		System.out.println(Arrays.toString( orginal));
		int count = 0, index = 0;
		for (int i = 0; i <  orginal.length; i++) {
			for (int j = 0; j < noDups.length; j++) {
				if ( orginal[i] == noDups[j]) {
					count++;
				}
			}
			if (count == 0) {
				noDups[index] =  orginal[i];
				index++;
			}
			count = 0;
		}
		String[] noDuplicates = new String[index];
		System.arraycopy(noDups, 0, noDuplicates, 0, index);
		System.out.println(Arrays.toString(noDuplicates));
	}
}

