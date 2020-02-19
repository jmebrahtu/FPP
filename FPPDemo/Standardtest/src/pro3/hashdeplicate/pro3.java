 package pro3.hashdeplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class pro3 {
	
// How to remove duplicate elements in an array using HashMap.
	public static void main (String[]args) {
		String[] testData= {"jirom","Mike","robiel","jirom","Mike"};
		String[] result= pro3.removeDups(testData);
		//System.out.println(Arrays.toString(result));
		
		 Set<String> s=new TreeSet<>();
		 for(String ss:result) {
			 
			 s.add(ss);
		 }
		 
	}
 public static String[] removeDups(String[]data) {
	
	  
	 	
	 HashMap<String,Integer>num= new HashMap<String,Integer>();
	// String[] temp= new String[data.length];
	 for (String str : data) {
		num.put(str, 0);
	}
	 String[] temp= new String[num.size()];
	 int i = 0;
	 for (String x : num.keySet()) {
		temp[i] = x;
		i++;
	}
	 
	 return temp; 
	 }
  	
 }

