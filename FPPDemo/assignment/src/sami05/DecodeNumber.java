package sami05;

public class DecodeNumber {

	public static void main(String[] args) {

		
		 /* 2. A number can be encoded as an array as follows. The first digit of the
		 * number (the most significant digit) is decremented by 1 and stored as the
		 * first element of the array. The second digit of the number is decremented by
		 * 2 and stored as the second element of the array, and so on. So, the number
		 * 430 is encoded as {3, 1, -3} because 4-1 = 3 3-2 = 1 0-3 = -3 Write a
		 * function named decodeNumber that takes an array of integers that is the
		 * encoding of a number (as described in the previous paragraph) and returns the
		 * number that was encoded. If the encoding is illegal, return -1. What is an
		 * illegal encoding? That is your job to figure out! Please include a comment in
		 * your answer describing what constitutes an illegal encoding.*/ 
		 
		int[] num = { 1, 0, 4, 3 };
		int result = decodedNumber(num);
		System.out.println(result);
	}

	public static int decodedNumber(int[] a) {

		int sum = 0;// This variable will used to hold the decodednumber
		String decodedNumber = "";
		if (a.length == 0) {
			return -1;

		} else {
			for (int i = 0; i < a.length; i++) {
				sum = a[i] + i + 1;
				if (sum >= 10) {// To check if the decoded number is >=10;mean
					return -1; //// if it has two digit number it is illegal
				} else {
					decodedNumber = decodedNumber + sum;// NB if this formula
														// change I can get different result
				}

			}
			return Integer.parseInt(decodedNumber);//integer.parseInt(s ) refers 
			                                                    //while int convert to string

		}
	}
}
