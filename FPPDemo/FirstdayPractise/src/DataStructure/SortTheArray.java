package DataStructure;

import java.util.Arrays;

public class SortTheArray {
//find the min elements and put it in the first postion;
	public static void main(String[] args) {
		int[] num= {16,15,37,7,1,-4,36,49};
		 
	
	int min=num [0];
	int indexmin=0;
	 for(int i=1;i<num.length;i++) {
		 if(num[i]<min) {
			 min= num[i];
			 indexmin=i;
		 }
		 
	 }
	 int temp=num[0];
	 num[0]= num[indexmin];
	 num[indexmin]= temp;
	 System.out.println(Arrays.toString(num));
}
	void  addElemnt(int[]a) {
		int lastindex= a.length-1;
		int pos=1;
		int Value= 9;
		for(int i= lastindex;i>pos;i--) {
			a[i+1]= a[i];
			
		}
		a[pos]=a[lastindex];
		lastindex++;
		System.out.println(Arrays.toString(a));
		
	
	}
		// by using selection sort  
		
	}

