package sami01;

public class LargestDigit {

	public static void main(String[] args) {
		
		 /* 1. Write a function named largestDigit that returns the largest digit of its
		 * integer argument. For example largestDigit(3185) returns 8 and
		 * largestDigit(-65665) returns 6. The function signature is int largestDigit
		 * (int n) Hint: use modulo base 10 arithmetic and integer division to isolate
		 * the digits of the number.*/
		 
		int sis = 65784;
		int result = largestDigit(sis);
       System.out.println(result);
	}

	public static int largestDigit(int n) {// always the parameter or input are declare in this

		int reminder;                  // declare the hint given and helps us for comparing
		int largestDigit = 0;
		n = Math.abs(n);             // declare n and math.abs indicates absolute value to get positive n
		while (n > 0) {
			reminder = n % 10;
			if (reminder > largestDigit) {
				largestDigit = reminder;
			}

			n = n / 10;
		}
		return largestDigit;

	}
}
