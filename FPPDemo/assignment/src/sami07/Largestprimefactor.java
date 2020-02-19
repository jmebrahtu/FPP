package sami07;

public class Largestprimefactor {

	public static void main(String[] args) {
		
		/* 1. Write a function named largestPrimeFactor that will return the largest
		 * prime factor of a number. If the number is <=1 it should return 0. Recall
		 * that a prime number is a number > 1 that is divisible only by 1 and itself,
		 * e.g., 13 is prime but 14 is not. The signature of the function is int
		 * largestPrimeFactor(int n)*/
		 
		int list = 24;
		int result = largestPrimeFactor(list);
		System.out.println(result);
	}//It is necessary to revise this question 

	public static int largestPrimeFactor(int a) {
		int count=0;
		int primefactor=0;
		if(a<=1) {
			return 0;
			
		}
			for(int i=2;i<=a;i++) {
				if(a%i==0) {
					for(int j=2;j<i;j++) {
						if(i%j==0) {
							count++;
							
						}
						
					}
					if(count==0) {
						if(i>primefactor){
							primefactor=i;
							
						}
						
					}
					count=0;
				}
				
			}
			
		
		return primefactor;	
	}
		
}
