package lecture4;

public class BinarySearch {

	public static void main(String[] args) {

		
			
		BinarySearch  B = new BinarySearch();  
				 int[] a = { 10, 20, 30, 40, 50, 60, 70,100};  
				 System.out.println(B.binarySearch(a,20));   } 
			
	
	public int binarySearch(int[] a, int key) {
				
		int l = 0;   int h = a.length; 
		return binarySearch(a, l, h, key);  
				  
	}  
	private int binarySearch(int[] a, int l, int h, int key) {
		
		if (key < a[0] || key > a[a.length - 1])  
		       return -1; 
		int mid = (l + h) / 2;  
		if (a[mid] == key) {
		 return mid;   
		 } else if (a[mid] < key) { 
		 return binarySearch(a, mid + 1, h, key); 
		 
			} else {   
			return binarySearch(a, l, mid-1, key); 
				 }  
	 } 


	}


