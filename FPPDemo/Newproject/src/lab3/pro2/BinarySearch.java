package lab3.pro2;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = {-4, 1, 7, 16, 35, 36, 49};

		System.out.println(Arrays.toString(nums));
		System.out.println("Is 16 in the Array?: " + BinarySearch.binarySearch(nums, 16));
		System.out.println("Is 7 in the Array?: " + BinarySearch.binarySearch(nums, 7));
		System.out.println("Is 40 in the Array?: " + BinarySearch.binarySearch(nums, 40));

		//Collections.binarySearch();
		//Arrays.binarySearch(a, key);

	}
	/*
	 * public static boolean binarySearch(int[] temp,int key) { return false; }
	 */
	
	public static boolean binarySearch(int[] temp,int key) {
		
		
	   int left=0;
	   int right= temp.length-1;
	   while(left<=right) {
		   int mid= (left+right)/2;
		  // System.out.println("mid:"+mid);
		   if(temp[mid]==key) {
			   return true;
		   }else if(key<temp[mid]) {
			   right= mid-1;
		   }else {
			   left= mid+1;
		   }
		   
	   }
	   return false;
	}
		/*int start=0;
		 * 
		int len=0;
		 int mid= start+len/2;
           for(int i=0;i<temp.length;i++)
          if(temp[key]==temp[mid]) {
        	  temp[key]=temp[mid];
        	  key= mid;
        	  return true;
          }else
        	  if(temp[key]<temp[mid]) {
        		  binarySearch(temp,mid-1);
        		  start= mid-1;
        		  return true;
        	  }else {
        		  binarySearch(temp,mid+1);
        		  len=mid+1;
               return true;
        		   }
          return false;
	}*/
}

