 package sami05;
import java.util.ArrayList;
public class FliterArray {

	public static void main(String[] args) {
		
		 /* 3. A filter is an array of integers that begins with the length of the filter
		  followed by elements that are 0 or 1. For example, {3, 0, 1, 0} is a filter
		  (note the length of a filter is one less than the length of the array that
		  represents the filter). A filter is used to return a sub-array of an array. A
		  one in the filter indicates that the corresponding array element should be
		  included in the result, a zero in the filter indicates that it should not be.
		  So the array {1, 2, 3, 4, 8} when filtered with {4, 0, 1, 1, 0} becomes {2,
		  3} because the elements of the array that correspond to the 1 elements of the
		  filter are 2 and 3. Here is what is going on visually:   {1, 2, 3, 4, 8}  (array to be filtered)
                            {4, 0, 1, 1, 0}     (filter) {2, 3}        (result)
          The elements 1 and 4 do not appear in the result because the 
        corresponding filter elements are 0. And the 8 (the 5th element
       of the array) does not appear in the result because the filter 
      only has four filtering elements.
            Write a method named filterArray that takes an array and a filter 
         as arguments and returns a filtered sub-array. If the size of the filter
         is greater than the number of elements in the array, return null. */ 

		

		int[] a = { 1, 2, 3, 4, 8 ,3};
		int[] fliter = { 4, 0, 1, 1, 0 };
		int[] result = filterArray(a, fliter);
		for(int i=0;i<result.length;i++) {
		System.out.println(result[i]);
		}
	}

	public static int[] filterArray(int[] a,int[] fliter) {
		if ((a.length) < fliter[0]) {
			return null;
		}
		ArrayList<Integer>num = new ArrayList<Integer>();
		
		
		for (int i = 1; i < fliter.length; i++) {//NB start from 1 index cuz 0index==filter.length-1;
		if(fliter[i]==1) {
			num.add(a[i-1]);//NB in the array give it start from 0. we must do it like that. 
			
		}
		
		}
	   
		int[]sis=new int [num.size()];// Create new array;
		for(int i=0;i<num.size();i++) {
			if(num.get(a[i])!=null) {
				sis[i]=num.get(a[i]);
			}
		}
		return sis;
	}
}
