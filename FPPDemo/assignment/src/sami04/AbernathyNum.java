package sami04;

public class AbernathyNum {

	public static void main(String[] args) {

		
		 /* 1. A Abernathy number is defined to be one that is the sum of more than one
		 * pair of prime numbers. Recall that a prime number is a number greater than 1
		 * whose only divisors are 1 and itself. For example, 16 is an Abernathy number
		 * because 16=3+13 and 5+11 (note that 3, 5, 11, and 13 are all prime). 24 is a
		 * Abernathy number because 24 = 5+19, 7+17 and 11+13. However, 8 is not an
		 * Abernathy number because 8 = 3+5 but no other pair of primes sums to 8. Write
		 * a function named isAbernathy that returns 1 if its argument is an Abernathy
		 * number, otherwise it returns 0. The function signature is int isAbernathy
		 * (int n) You may assume that a function named isPrime already exists that
		 * returns 1 if its argument is a prime. You can call this function but do not
		 * have to write it.*/ 
		 
          int n=8;
		int result = isAbernathy(n);
		System.out.println(result);
	}

	
	public static int isAbernathy(int a) {
		int sum = 0;
		int count = 0;
		for (int i = 2; i < a; i++) {
			if (prime(i) && prime(a - i)) {
				sum = sum+i + (a - i);
				count++;
			}
		}
		if (count > 1) {
			return 1;
		} else {
			return 0; 
		}
	}

	public static boolean prime(int num) {

		boolean prime = false;
		for (int i = 2; i <= num / 2; ++i) {//3
			
			if (num % i == 0) {// condition for nonprime number
				prime = true;
				break;
			}
		}
		return prime;

	}

}
