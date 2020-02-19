 package sami05;

public class DigitFactoral {

	public static void main(String[] args) {
		
		 /* 1. A number, greater than zero, is said to be digit-factorable if the product
		 * of its non-zero digits divides the number evenly. So 7035 is digit-factorable
		 * because the product of its non-zero digits is 105 (7*3*5) and 105 divides
		 * 7035 with no remainder (7035 = 67*105). Write a function named
		 * isDigitFactorable that returns 1 if its argument is digit-factorable,
		 * otherwise it returns 0. The signature of the function is int*/
		 
		// int bro = 7035;
		// int result = isDigitFactorable(bro);
		System.out.println(isDigitFactorable(7035));

	}

	public static int isDigitFactorable(int n) {
		int prod = 1;
		int number = n;
		int i;
		if (number <= 0) {
			return 0;
		}

		while (number > 0) {
			i = number % 10;
			number = number / 10;
			if (i != 0)
				prod = prod * i;

		}

		if (n % prod == 0) {
			return 1;

		} else {
			return 0;
		}
	}

}
