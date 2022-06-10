package Lec_09;

public class Array_basics {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 }; // 10k
//		int max = Max(arr);
//		System.out.println(max);
		Disp(arr);
//		arr = Rev1(arr);
		Rev2(arr);
		Disp(arr);

	}

	public static int Max(int[] arr) {
		// TODO Auto-generated method stub
		int jeb = Integer.MIN_VALUE;
		for (int aam : arr) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int Find(int[] arr, int ele) {
//	 tell me idx of ali !!
//		if it does not exists !! return -1;
		for (int idx = 0; idx < arr.length; idx++) {
			if (arr[idx] == ele) {
				return idx;
			}
		}
		return -1;
	}

	public static int[] Rev1(int[] arr) {
		int idx1 = 0;
		int idx2 = arr.length - 1;
		int[] rev_arr = new int[arr.length]; // 20k
		while (idx2 >= 0) {
			rev_arr[idx1] = arr[idx2];
			idx1++;
			idx2--;
		}
//		arr = rev_arr;
		return rev_arr;
	}

	public static void Rev2(int[] arr) {
		int L = 0;
		int R = arr.length - 1;
		while (L < R) {
//			swap index L and R!!
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
		return;
	}

	public static void Disp(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
