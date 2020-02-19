package sami02;

public class Q2 {

	public static void main(String[] args) {
		
		 /* 2. The following method of multiplying numbers was used in ancient times. Put
		 * the numbers to be multiplied side by side. Call them n1 and n2. If n1 is odd
		 * put an asterisk next to n2. Next, divide n1 by 2, discarding any remainder
		 * and multiply n2 by 2. If the new value of n1 is odd put an asterisk next to
		 * the new value of n2. Continue dividing n1 by 2 and discarding the remainder
		 * and doubling n2 until n1 is 0. Mark each value of n2 that is associated with
		 * an odd value of n1 with an asterisk. Then sum all the n2 values that have
		 * asterisks next to them. The result is the product of n1 * n2.*/
		 
		int x1 = Math.abs(3);// math.abs is like absolute value
		int x2 = Math.abs(4);// declare or store the input
		int result = ancientMultiplication(x1, x2);
		System.out.println(result);
	}//I want revise this question 

	public static int ancientMultiplication(int n1, int n2) {
		int sum = 0;
		int x1 = Math.abs(n1);
		int x2 = Math.abs(n2);
		while (x1 > 0) {
			if (x1 % 2 != 0) {
				sum += x2;
			}
			x1 = n1 / 2;
			x2 = n2 * 2;
		}
		if (n1 > 0 && n2 < 0 || n1 < 0 && n2 > 0) {
			sum *= -1;
		}
		return sum;
	}
}
