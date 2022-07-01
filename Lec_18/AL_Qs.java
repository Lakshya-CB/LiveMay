package Lec_18;

import java.util.ArrayList;

public class AL_Qs {
	public static void main(String[] args) {
		int[] arr1 = { 5, 7, 10, 10, 10, 20, 30, 30, 50, 60, 60, 80 };
		int[] arr2 = { 10, 10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90 };
//		ArrayList<Integer> AL = Intersection(arr1, arr2);
//		System.out.println(AL);

		int[] one = { 9,9,9,9,9,9 };
		int[] two = { 1 };
		System.out.println(Add(one, two));
	}

	public static ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {
		int idx1 = 0;
		int idx2 = 0;
		ArrayList<Integer> AL = new ArrayList<>();
		while (idx2 < arr2.length && idx1 < arr1.length) {
			if (arr1[idx1] == arr2[idx2]) {
				AL.add(arr1[idx1]);
				idx1++;
				idx2++;
			} else if (arr1[idx1] < arr2[idx2]) {
				idx1++;
			} else {
				idx2++;
			}
		}
		return AL;
	}

	public static ArrayList<Integer> Add(int[] arr1, int[] arr2) {
		int carry = 0;
		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;
		ArrayList<Integer> AL = new ArrayList<>();
		while (idx1 >= 0 || idx2 >= 0) {
			int sum = carry;
			if (idx1 >= 0) {
				sum = sum + arr1[idx1];
			}
			if (idx2 >= 0) {
				sum = sum + arr2[idx2];
			}
			carry = sum / 10;
			int dogot = sum % 10;
			AL.add(0, dogot);
			idx1--;
			idx2--;
		}
		if (carry > 0) {
			AL.add(0, 1);
		}
		return AL;
	}

}
