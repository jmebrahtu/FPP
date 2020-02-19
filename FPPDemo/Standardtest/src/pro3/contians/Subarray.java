package pro3.contians;

public class Subarray {

	public static void main(String[] args) {
		String[] arr1 = { "A", "C", "E" };
		String[] arr2 = { "A", "B", "C", "D", "E" };
		String[] arr3 = { "A", "C", "F" };
		System.out.println("IS arr1 a subarray of arr2?(Expected answer: yes)" + isSubArray(arr1, arr2));
		System.out.println("IS arr3 a subarray of arr2?(Expected answer: no)" + isSubArray(arr3, arr2));
	}
	// return true if everystring in arr1 is contianed in arr2.Assume that neither
	// array is null.

	public static boolean isSubArray(String[] arr1, String[] arr2) {
		if (arr1 == null && arr2 == null) {
			return true;
		}
		int count = 0;
		for (String x : arr1) {
			for (String y : arr2) {
				if (x == y) {
					count++;
				}
			}

		}
		if (count == arr1.length) {
			return true;
		}
		return false;
	}
}
