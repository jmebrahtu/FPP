  package sami07;
import java.util.ArrayList;
public class Simplepatternmatching {
 
	public static void main(String[] args) {

		
		 /* 3. Consider a simple pattern matching language that matches arrays of
		 * integers. A pattern is an array of integers. An array matches a pattern if it
		 * contains sequences of the pattern elements in the same order as they appear
		 * in the pattern. So for example, the array {1, 1, 1, 2, 2, 1, 1, 3} matches
		 * the pattern {1, 2, 1, 3} as follows: */
		
		int[] list = {1,2,2,3,3,4,4,1};
		int []num= {1,2,3,4,1};
          int result=matchPattern(list, num);
		System.out.println(result);
	} //I must understand first and work again with it. 

	public static int matchPattern(int[] a,  int[] pattern) { 
    ArrayList<Integer>mylist= new ArrayList<Integer>();
        mylist.add(a[0]) ;    //help to make the element in pattern .
    for(int i=1;i<a.length;i++) {
    	if(a[i]!=a[i-1]) {
    		mylist.add(a[i]);
    		
    	}
    	}
    if(pattern.length!=mylist.size()) {
    	return 0;
    	
    }
    for(int i=0;i<mylist.size();i++) {
    	if(pattern[i]!=mylist.get(i)) { 
    		return 0;
    		
    	}
    	
    }
    return 1;
      }
    }

