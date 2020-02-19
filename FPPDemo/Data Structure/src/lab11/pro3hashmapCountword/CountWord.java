  package lab11.pro3hashmapCountword;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class CountWord {
	// This function prints frequencies of all elements
	static void printFreq(String arr[]) {
		// Creates an empty HashMap
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		for (String x : arr) {// like a[i]=x the first word in the array
			Integer count = 0;
			for (String y : arr) {//like a[j]=y1;and then the 2nd for loop search ,reach at the end 
				if (x == y) {// then if it gets the same word as x it counts
					count++;
				}
				hmap.put(x, count);
			}
//			TreeMap<String, Integer>num= new TreeMap<String,Integer> ();
//		    num.put(x, count);
//		   System.out.println("print the in soretd way="+ num);
//		
	//	count=0;
		}
    
		// Print result
		for (Map.Entry m : hmap.entrySet())
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
	}

	// Driver method to test above method
	public static void main(String[] args) {
		String arr[] = { "andy", "mike", "andy", "andy", "andy", "mike", "emma" };
		printFreq(arr);
	}
}