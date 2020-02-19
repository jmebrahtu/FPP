package sample;

public class HappyArray {

	public static void main(String[] args) {
		int[] arr = { 5, 13, 2,5};
		System.out.println(isHappyArray(arr));
	}
	

	public static int isHappyArray(int[] a) {
		
		
		
		  if (a[a.length - 1] == 5)
		  
		  { return 0; }
		 
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] == 5 && a[i + 1] != 13) {
				return 0;

			}
		}
		return 1;

	}

}
