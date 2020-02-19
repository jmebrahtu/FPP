 package sami07;

public class Selam {

	public static void main(String[] args) {
		
		System.out.println(isLargestPrimeFactor(24));
	}

	public static int isLargestPrimeFactor(int a) {
		int i = 2;
		int largestfactor = 0;
		while (a > 1) {
			if (a % i == 0) {
				largestfactor = i;
				a = a / i;
				
			}else {
			i++;
		}
		}
		return largestfactor;
	}
}
