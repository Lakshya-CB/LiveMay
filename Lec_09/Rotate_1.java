package Lec_09;

public class Rotate_1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Disp(arr);
//		rot(arr, 21);
		rotation(arr, 5);
		Disp(arr);
	}

	public static void rotation(int[] arr, int rot) {
		rot = rot % arr.length;
		Rev(arr, 0, arr.length - 1);
//		P1 from 0 to rot-1!!
		Rev(arr, 0, rot - 1);
//		P2 form rot to end!!
		Rev(arr, rot, arr.length - 1);
	}

	public static void rot(int[] arr, int rot) {
		rot = rot % arr.length;
		for (int r = 0; r < rot; r++) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = temp;
		}
	}

	public static void Rev(int[] arr, int L, int R) {
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