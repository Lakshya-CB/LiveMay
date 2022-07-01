package Lec_16;

public class Intersection {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 7, 10, 12, 15, 30, 34 };
		int[] arr2 = { 1, 5, 7, 8, 10, 15, 16, 19 };

		int idx1 = 0;
		int idx2 = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] == arr2[idx2]) {
				System.out.println(arr1[idx1]);
				idx1++;
				idx2++;
			} else if (arr1[idx1] > arr2[idx2]) {
				idx2++;
			} else {
				idx1++;
			}

		}
	}

}
