package sample;

public class FunArray {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 4  };
		System.out.println(isFunArray(arr));
	}

	public static int isFunArray(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] != a[i]) {
					sum = sum + a[j];
				}

			}
			if (a[i] > sum) {
				return 0;

			} else {
				sum = 0;
			}
		}
		return 1;
	}

}
