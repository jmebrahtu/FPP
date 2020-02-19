   package sami07;

import java.util.ArrayList;

public class Arithematicstates {

	public static void main(String[] args) {
		
		/* 2. The fundamental theorem of arithmetic states that every natural number
		 * greater than 1 can be written as a unique product of prime numbers. So, for
		 * instance, 6936=2*2*2*3*17*17. Write a method named encodeNumber what will
		 * encode a number n as an array that contains the prime numbers that, when
		 * multipled together, will equal n. So encodeNumber(6936) would return the
		 * array {2, 2, 2, 3, 17, 17}. If the number is <= 1 the function should return
		 * null 
		 * If you are programming in Java or C#, the function signature is int[ ]
		 * encodeNumber(int n) */
		int sis= 6936;
		int[] result=encodedArray(sis);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		// I have a small mistake so i must revise it.

	}
 public static int[]  encodedArray(int a) {
	 ArrayList<Integer>mylist=new ArrayList<Integer>();
 
	 int i=2;
	 
	 while(a>1) {
		 if(a%i==0) {
			 mylist.add(i);
			 a=a/i;
		 }
	 i++;
     }
	 int[]num= new int[mylist.size()];
	 for(int j=0;j<mylist.size();j++) {
		 num[j]=mylist.get(j);
		 
	 }
    
 return num;
   }
  }