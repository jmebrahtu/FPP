package lesson2;

public class Prog8 {

	public static void main(String[] args) {
		// Input of array using direct assignment
		int[] array = { -60, -21, 3, 45, 0, 18, 6, 3, 1, 0, 22 };

		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		System.out.println("The minimum of the array is: " + min);
		
//		 //Input of array using console is also available below
//		 int len = args.length;
//		 int[] array = new int[len];
//		
//		 for(int i=0; i<args.length;i++) {
//		 array[i]=(int) Integer.parseInt(args[i]);
//		 }
//		 int min = array[0];
//		 for (int i = 1; i < array.length; i++) {
//		 if (array[i] < min)
//		 min = array[i];
//		 }
//		 System.out.println("The minimum of the array is: " + min);
//
	}



	}


