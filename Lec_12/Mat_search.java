package Lec_12;

public class Mat_search {
	public static void main(String[] args) {
		int mat[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 28, 37, 48 }, { 29, 33, 39, 50 } };
		System.out.println(find(mat, 19));
	}

	public static boolean find(int[][] mat, int ele) {
		int r = 0;
		int c = mat[0].length - 1;
		while (c >= 0 && r < mat.length) {
			if (mat[r][c] == ele) {
				return true;
			} else if (mat[r][c] > ele) {
				c--;
			} else {
				r++;
			}
		}
		return false;
	}
}
