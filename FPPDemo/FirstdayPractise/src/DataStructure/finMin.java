package DataStructure;

import java.util.Arrays;

public class finMin {
// this wrong i must reapted again this one
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] unsorted= {"bob","aman","selam","aman"};
		String[] sorted=new String[unsorted.length];
		for (int i = 0; i < unsorted.length-1; i++) {
			if (unsorted[i].compareTo(unsorted[i+1])>=1) {
				sorted[i]=unsorted[i+1];
			}else if (unsorted[i].compareTo(unsorted[i+1])<-1) {
				sorted[i]=unsorted[i+1];
			}else
				sorted[i]=unsorted[i+1];
		}
		System.out.println(Arrays.toString(sorted));
	}

}
