package Lec_12;

public class Wave_print {
	public static void main(String[] args) {

		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		wave(arr);
	}

	public static void wave(int[][] mat) {
		for (int col = 0; col < mat[0].length; col++) {
			for (int row = 0; row < mat.length; row++) {
				int rtp = row;
				if (col % 2 == 1) {
					rtp = mat.length - 1 - row;
				}
				System.out.print(mat[rtp][col] + " ");
			}
			System.out.println("==");
		}
	}
}
