package Lec_12;

public class Anti_Clockwise {
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		print(arr);
	}

	public static void print(int[][] mat) {
		int cnt = 0;
		int pdt = mat.length * mat[0].length;
		int min_r = 0;
		int min_c = 0;
		int max_r = mat.length - 1;
		int max_c = mat[0].length - 1;
		while (min_r <= max_r && min_c <= max_c) {
			for (int r = min_r; r <= max_r && cnt < pdt; r++) {
				System.out.print(mat[r][min_c] + " ");
				cnt++;
			}

			System.out.println();
			for (int c = min_c + 1; c <= max_c && cnt < pdt; c++) {
				System.out.print(mat[max_r][c] + " ");
				cnt++;
			}

			System.out.println();
			for (int r = max_r - 1; r >= min_r && cnt < pdt; r--) {
				System.out.print(mat[r][max_c] + " ");
				cnt++;
			}

			System.out.println();
			for (int c = max_c - 1; c >= min_c + 1 && cnt < pdt; c--) {
				System.out.print(mat[min_r][c] + " ");
				cnt++;

			}
			System.out.println();
			min_r++;
			min_c++;
			max_c--;
			max_r--;
		}
	}
}
