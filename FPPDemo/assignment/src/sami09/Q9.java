package sami09;

import java.sql.Date;

//import java.util.Date;

public class Q9 {

	public static void main(String[] args) {
		
		 /* 11. An array is called layered if its elements are in ascending order and
		 * each element appears two or more times. For example, {1, 1, 2, 2, 2, 3, 3} is
		 * layered but {1, 2, 2, 2, 3, 3} and {3, 3, 1, 1, 1, 2, 2} are not. Write a
		 * method named isLayered that accepts an integer array and returns 1 if the
		 * array is layered, otherwise it returns 0.*/
		 //Two criteria;
		//1.Elements should in ascending order;
		//2.Elements should occur more than two; 
		 int[]num= {1,1,2,2,3,3,4,4};
		 int result=isLayered(num);
		 System.out.println(result);
	//	 java.util.Date today=12/12/19;

	}
	
		 public static int isLayered(int[ ] a) {
			if(a==null || a.length==0)
				return 0;
			int previous = a[0]; // set previous
			int countNum=1; // set count for previous to 1
			for(int i=1;i<a.length;i++) {
				if(previous==a[i]) {
					countNum++; 
				}//if previous equals current(a[i]) increment
				else {
					if(countNum<2) //if previous occurs less than two return 0(not layered)
						return 0;
					if(previous>a[i])// if previous is not smaller than a[i] return 0(not layered)
						return 0;
					countNum=1;//reset to 1 to start counting how much a[i] occurs
					previous=a[i];//assign previous to a[i] for the next iteration
				}
			}
			if(countNum<2) {
				return 0;
		 }
		 return 1;
		 }
            }