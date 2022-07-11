package Lec_21;

public class Array_rec {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 10, 30, 20, 10 };
//		print(arr, 0);
//		Rev(arr, 0);
//		System.out.println(Max(arr, 0));
		System.out.println(FirstOcc(arr, 2, 10));
	}

	public static void print(int[] arr, int i) {
		if (i == arr.length) {
			return;
		}
//	BP : from i to end
//	SP : from i+1 to end
		System.out.println(arr[i]);
		print(arr, i + 1);
	}

	public static void Rev(int[] arr, int i) {
		if (i == arr.length) {
			return;
		}
//	BP : Rev(i,arr)
//	SP: Rev(i+1,arr)

		Rev(arr, i + 1);
		System.out.println(arr[i]);
	}

	public static int Max(int[] arr, int i) {
		if (i == arr.length) {
			return Integer.MIN_VALUE;
		}
//		BP : max?!=Max(i);
//		SP : sp = Max(i+1);
		int sp = Max(arr, i + 1);
		return Math.max(sp, arr[i]);
	}

	public static int FirstOcc(int[] arr, int i, int ali) {
		if (i == arr.length) {
			return -1;
		}
//		BP : FirstOcc(arr,0)
//		SP : FirstOcc(arr, 1)
		int sp = FirstOcc(arr, i + 1, ali);
		if (arr[i] == ali) {
			return i;
		}
		return sp;
	}

	public static int LastOcc(int[] arr, int i, int ali) {
		if (i == arr.length) {
			return -1;
		}
//		BP : FirstOcc(arr,0)
//		SP : FirstOcc(arr, 1)
		int sp = LastOcc(arr, i + 1, ali);
		if (sp == -1 && arr[i] == ali) {
			return i;
		}
		return sp;
	}

	public static int[] AllOcc(int[] arr, int ali, int i, int total) {
		if (i == arr.length) {
//			BC!! total= ali ki total occ
			return new int[total];
		}

		if (arr[i] == ali) {
			int[] sp = AllOcc(arr, ali, i + 1, total + 1);
//			sp[total] = i;
			return sp;

		} else {
			int[] sp = AllOcc(arr, ali, i + 1, total);
			return sp;

		}
	}
}
