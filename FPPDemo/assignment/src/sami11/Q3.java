package sami11;

public class Q3 {

	public static void main(String[] args) {
		
		 /* 3. Nnormal number is defined to be one that has no odd factors , except for 1
		 * and possibly itself. Write a method named isNormal that returns 1 if its
		 * integer argument is normal 0 otherwise */
		
		 int sis=2;
		int result=isNormal(sis);
		System.out.println(result);
	}

	public static int isNormal(int a) {
		if (a == 0 || a == 1) {
			return 1;

		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) { // implies is i a factor of a.

				if (i % 2 != 0) {//implies is that a an odd number
					return 0;

				}
			  }
			}
			return 1;

		}
		
	}

