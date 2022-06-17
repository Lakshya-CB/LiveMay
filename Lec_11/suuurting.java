package Lec_11;

import java.util.Arrays;

public class suuurting {
	public static void main(String[] args) {
		int[] arr = { 88, 66, 55, 44, 22 };
		System.out.println(Arrays.toString(arr));
		insertion(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void bubble(int[] arr) {
		for (int count = 0; count < arr.length - 1; count++) {
			for (int idx = 0; idx <= arr.length - 2; idx++) {
//		bubble ? idx and idx+1!!
				if (arr[idx + 1] < arr[idx]) {
					int temp = arr[idx];
					arr[idx] = arr[idx + 1];
					arr[idx + 1] = temp;
				}
			}
		}
	}

	public static void selection(int[] arr) {
		for (int count = 1; count <= arr.length - 1; count++) {

			int last = arr.length - count;
			int max = last;
			for (int i = 0; i <= last; i++) {
				if (arr[max] < arr[i]) {
					max = i;
				}
			}
			// chwap!!
			// max with last!!
			int temp = arr[max];
			arr[max] = arr[last];
			arr[last] = temp;
		}
	}

	public static void insertion(int[] arr) {
		for (int count = 0; count <= arr.length - 2; count++) {
			int idx = count;
			int ele = arr[idx + 1];

			while (idx >= 0 && arr[idx] > ele) {
				arr[idx + 1] = arr[idx];
				idx--;
			}
//			System.out.println(Arrays.toString(arr));
			arr[idx + 1] = ele;
//			System.out.println(Arrays.toString(arr));
//			System.out.println("====================");
		}
	}
}
